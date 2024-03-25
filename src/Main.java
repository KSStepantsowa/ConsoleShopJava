import menus.AdminMenu;
import users.Admin;
import users.Buyer;
import users.Seller;
import users.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        User newUser = new Admin("alskdj", "askjdhakj");

//        if (newUser instanceof Admin) {
//            munus.AdminMenu.printMenu();
//        } else if (newUser instanceof Seller) {
//            System.out.println("\nYou are logged in as seller");
//        } else if (newUser instanceof Buyer) {
//            System.out.println("\nYou are logged in as buyer");
//        }

        users.add(new Admin("admin", "admin"));
        users.add(new Seller("abcInvest", "qwerty", "ABC Invest Group",
                "Minsk, Nemiga 15", "www.abc-invest.by"));
        users.add(new Buyer("vpoupkine", "Test1234!", "Vasiliy Poupkine",
                "+375 37 537-53-75", "v.poupkine@mail.ru"));

        User loggedInUser = login();

        switch (loggedInUser.getUserType()) {
            case ADMIN -> AdminMenu.printMenu();
            case SELLER -> System.out.println("\nYou are logged in as seller");
            case BUYER -> System.out.println("\nYou are logged in as buyer");
        }
    }

    private static User login() {
        User loggedInUser = null;
        boolean isLoggedIn = false;
        Scanner scanner = new Scanner(System.in);
        while (!isLoggedIn) {
            System.out.print("Please enter login: ");
            String userLogin = scanner.nextLine();
            System.out.print("Please enter password: ");
            String userPassword = scanner.nextLine();

//            List<User> loggedInUsers = users.stream()
//                    .limit(1)
//                    .filter(user -> user.getPassword().equals(userPassword) && user.getUsername().equals(userLogin))
//                    .collect(Collectors.toList());
//
//            loggedInUser = loggedInUsers.get(0);

            for (User user : users) {
                if (user.getUsername().equals(userLogin) && user.getPassword().equals(userPassword)) {
                    loggedInUser = user;
                    isLoggedIn = true;
                    System.out.printf("Welcome, %s! You've logged in successfully!\n", userLogin);
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