package users;

import enums.UserType;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password, UserType.ADMIN);
    }
}