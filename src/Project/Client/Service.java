package Project.Client;

import Project.Main;
import Project.Model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {

    final private static String EmailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.+[a-zA-Z]{2,}$";
    final private static String FirstNamePattern = "^[a-zA-Z]{3,}";
    final private static String LastNamePattern = "^[a-zA-Z]{3,}";
    public  Client registerNewClient () {

        Client client = null;
        System.out.println("Provide a Project.Model.Client details");
        System.out.println("Email:");
        String email = Main.scanner.nextLine();

        System.out.println("First Name:");
        String firstName = Main.scanner.nextLine();

        System.out.println("Last Name:");
        String lastName = Main.scanner.nextLine();

        if (isEmailValid(email)&&isLastNameValid(lastName)&&isFirstNameValid(firstName)) {
            client = buildNewClient(email,firstName,lastName);

            System.out.println("New client: " + client.getFirstName() + " " +
                    client.getLastName() + " (" + client.getEmail() + ")"
                    + " has been added");
        } else {
            System.out.println("Provided Email or First/Last name is invalid");
        }
        return client;
    }
    private static Client buildNewClient(String email,String firstName,String lastName) {
        Client client = new Client();

        email = client.getEmail();

        firstName = client.getFirstName();

        lastName = client.getLastName();

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
