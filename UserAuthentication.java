// Custom exception class for authentication errors
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

// Class to handle user authentication
class UserAuthentication {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    // Method to authenticate user
    public static void authenticate(String username, String password) throws AuthenticationException {
        if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
            throw new AuthenticationException("Invalid username or password");
        }
        System.out.println("Authentication successful");
    }
}

public class Exception {
    public static void main(String[] args) {
        try {
            // Test authentication
            UserAuthentication.authenticate("admin", "password123"); // Correct credentials
            // UserAuthentication.authenticate("user", "pass"); // Incorrect credentials
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}

