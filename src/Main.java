import java.util.Scanner;

public class Main {

    static String Password = "password";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }
    static void run(){
        boolean PassCheck = false;
        for (int i = 0; i<3;i++){
            System.out.println(" your password:");
            String input = scanner.nextLine();
            if (Password.equals(input)){
                PassCheck = true;
                break;
            }
            System.out.println("access denied, the password was wrong.");
        }
        System.out.println(PassCheck ? "Welcome to the application" : "aplplication was blocked");
    }
}