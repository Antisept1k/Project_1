import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static String EmailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.+[a-zA-Z]{2,}$";
    static String FirstNamePattern = "^[a-zA-Z]{3,}";
    static String LastNamePattern = "^[a-zA-Z]{3,}";

    static String Password = "password";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    static void run() {
        if (auth()) {
            registerNewClient();
        }
    }
        static boolean auth() {
            boolean PassCheck = false;
            for (int i = 0; i < 3; i++) {
                System.out.println(" your password:");
                String input = scanner.nextLine();
                if (Password.equals(input)) {
                    PassCheck = true;
                    break;
                }
                System.out.println("access denied, the password was wrong.");
            }
            System.out.println(PassCheck ? "Welcome to the application" : "aplplication was blocked");
            return PassCheck;
        }
        static void registerNewClient () {

            System.out.println("Provide a Client details");
            System.out.println("Email:");
            String email = scanner.nextLine();

            System.out.println("First Name:");
            String firstName = scanner.nextLine();

            System.out.println("Last Name:");
            String lastName = scanner.nextLine();

            if (isEmailValid(email)&&isLastNameValid(lastName)&&isFirstNameValid(firstName)) {
                Client client = buildNewClient(email,firstName,lastName);

                System.out.println("New client: " + client.FirstName + " " + client.LastName
                        + " (" + client.Email + ")" + " has been added");
            } else {
                System.out.println("Provided Email or First/Last name is invalid");
            }
        }

    private static Client buildNewClient(String email,String firstName,String lastName) {
        Client client = new Client();

        client.Email = email;

        client.FirstName = firstName;

        client.LastName = lastName;

            return client;

        }

        private static boolean isEmailValid (String email) {
            Pattern pattern = Pattern.compile(EmailPattern);
            Matcher match = pattern.matcher(email);

            return match.matches();
        }
        private static boolean isFirstNameValid (String firstName) {
            Pattern pattern = Pattern.compile(FirstNamePattern);
            Matcher match = pattern.matcher(firstName);

            return match.matches();
        }
        private static boolean isLastNameValid (String lastName){

            Pattern pattern = Pattern.compile(LastNamePattern);
            Matcher match = pattern.matcher(lastName);

            return match.matches();
        }

    }



