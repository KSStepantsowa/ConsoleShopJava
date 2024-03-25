package users;

import enums.UserType;

public class Seller extends User {
    private String companyName;
    private String address;
    private String webPage;

    public Seller(String username, String password, String companyName, String address, String webPage) {
        super(username, password, UserType.SELLER);
        this.companyName = companyName;
        this.address = address;
        this.webPage = webPage;
    }
}
