package users;

import enums.UserType;

public class Buyer extends User {
    private String fullName;

    private String phoneNr;

    private String email;

    public Buyer(String username, String password, String fullName, String phoneNr, String email) {
        super(username, password, UserType.BUYER);
        this.email = email;
        this.fullName = fullName;
        this.phoneNr = phoneNr;
    }

    @Override
    public void sayHello() {
        System.out.println("Hi, I am a buyer");
    }
}
