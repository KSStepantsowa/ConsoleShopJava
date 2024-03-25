package users;

import enums.UserType;

public class User {
    protected String username;
    protected String password;
    protected UserType userType;

    public User(String username, String password, UserType userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void sayHello() {
        System.out.println("Hi, I am a user");
    }
}