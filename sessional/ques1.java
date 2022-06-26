import java.util.*;

class ques1 {

    public static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        if (username.equals("")) {
            throw new NullPointerException("\nUsername is NULL!!!");
        } else if (password.equals("")) {
            throw new NullPointerException("\nPassword is NULL!!!");
        } else if (username.equals("admin") && password.equals("admin")) {
            System.out.println("\nSuccessfully Logged In!!!");
        } else {
            throw new IllegalArgumentException("\nIncorrect password!!!");
        }
    }

    public static void logout() {
        System.out.println("Successfully Logged Out!!!");
    }

    public static void handleException() {
        try {
            login();
        } catch (NullPointerException e) {
            System.out.println("Username or Password is NULL!!!");
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect Password!!!");
        } finally {
            System.out.println("\nYou can try logging in after 30 minutes!!!");
            logout();
        }

    }

    public static void main(String[] args) {
        handleException();
    }
}