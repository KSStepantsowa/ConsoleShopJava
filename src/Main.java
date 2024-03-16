import java.util.Scanner;

public class Main {
    static final User adminUser = new User("admin", "admin", "admin");
    static User abcInvestGroup = new User("abcInvest", "qwerty", "seller");
    static User vasiliPoupkine = new User("vpoupkine", "Test1234!", "buyer");
    static User[] users = { adminUser, abcInvestGroup, vasiliPoupkine };


    public static void main(String[] args) {

        User loggedInUser = login();

        switch (loggedInUser.getUserType()) {
            case "admin" -> AdminMenu.printMenu();
            case "seller" -> System.out.println("\nYou are logged in as seller");
            case "buyer" -> System.out.println("\nYou are logged in as buyer");
        }
    }

    private static User login() {
        User loggedInUser = new User("", "", "");
        boolean isLoggedIn = false;
        Scanner scanner = new Scanner(System.in);
        while (!isLoggedIn) {
            System.out.print("Please enter login: ");
            String userLogin = scanner.nextLine();
            System.out.print("Please enter password: ");
            String userPassword = scanner.nextLine();

            for (User user : users) {
                if (user.getUsername().equals(userLogin) && user.getPassword().equals(userPassword)) {
                    loggedInUser = user;
                    isLoggedIn = true;
                    System.out.printf("Welcome, %s! You've logged in successfully!", userLogin);
                    break;
                }
            }
            if (!isLoggedIn) {
                System.out.println("Sorry, username or password is incorrect");
            }
        }
        return loggedInUser;
    }


}