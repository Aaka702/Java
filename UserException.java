import java.util.Scanner;

// Custom exception class for authentication errors
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

// Class to handle user authentication
class UserAuthentication {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";

    // Method to authenticate user
    public static void authenticate(String username, String password) throws AuthenticationException {
        if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
            throw new AuthenticationException("Invalid username or password");
        }
        System.out.println("Authentication successful");
    }
}

public class UserException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter username
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            // Prompt the user to enter password
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Test authentication
            UserAuthentication.authenticate(username, password);
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

