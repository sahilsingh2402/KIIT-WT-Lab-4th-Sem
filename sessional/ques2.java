import java.util.*;

public class ques2 {

    public static void login() throws NullPointerException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        if (username.equals("")) {
            throw new NullPointerException("username is null");
        } else if (password.equals("")) {
            throw new NullPointerException("password is null");
        } else if (username.equals("sahil") && password.equals("singh")) {
            System.out.println("successfully logged in");
        } else {
            throw new IllegalArgumentException("incorrect password");
        }
    }

    public static void logout() {
        System.out.println("successfully logged out");
    }

    public static void handleException() {
        try {
            login();
        } catch (NullPointerException e) {
            System.out.println("username or password is null");
        } catch (IllegalArgumentException e) {
            System.out.println("incorrect password");
        } finally {
            System.out.println("you can try logging in after 30mins");
        }
    }

    public static void main(String[] args) throws NullPointerException {
        login();
        logout();
        handleException();

    }
}