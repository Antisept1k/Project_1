package Project.Component;

import Project.Main;

public class Authenticator {
    final private static String Password = "password";
    public static boolean auth() {
        boolean PassCheck = false;
        for (int i = 0; i < 3; i++) {
            System.out.println(" your password:");
            String input = Main.scanner.nextLine();
            if (Password.equals(input)) {
                PassCheck = true;
                break;
            }
            System.out.println("access denied, the password was wrong.");
        }
        System.out.println(PassCheck ? "Welcome to the application" : "aplplication was blocked");
        return PassCheck;
    }
}
