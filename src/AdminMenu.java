import java.util.Scanner;

public class AdminMenu {
    static final String MENU_CONTENT = "1. Add user\n2. Delete user\n0. Exit\n\nPlease enter your selection";

    public static void printMenu() {
        System.out.println(MENU_CONTENT);
        Scanner scanner = new Scanner(System.in);
        int userSelection = scanner.nextInt();

        switch (userSelection) {
            case 1 -> printAddUserMenu();
            case 2 -> printDeleteUserMenu();
            case 0 -> {
                return;
            }
            default -> System.out.println("Sorry, unknown menu option");
        }
    }

    private static void printAddUserMenu() {
        System.out.println("Adding user");
    }

    private static void printDeleteUserMenu() {
        System.out.println("List of users to delete");
    }
}