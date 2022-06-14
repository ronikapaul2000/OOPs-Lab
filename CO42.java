import java.util.Scanner;
import java.*;

public class CO52 {
    public static class InvalidUserException extends Exception {

        public InvalidUserException() {
            super("Invalid username / password provided!");	
        }

    }
    public static void main(String[] args) {

        // A invalid username
        String username = "john";

        String password = "pass";

        try {

            if (username.equals("john") && password.equals("pass")) {

                System.out.println("Authenticated successfully!");

            } else {

                throw new InvalidUserException();
            }

        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }
}

    
