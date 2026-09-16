package OOP.accounts;

public class UserAccount {
    // 1. Fill out the properties
    public String username; 
    private String password;
    public Integer accountAge;
    private Integer userAge;

    // 2. Write constructor for UserAccount
    public UserAccount(String username, String password, Integer accountAge, Integer userAge) {
        this.username = username; 
        this.password = password; 
        this.accountAge = accountAge;
        this.userAge = userAge;
    }

    // 3. Write your methods here
    public void comment() {
        System.out.println("My name is " + username);
        System.out.println("My account age is " + accountAge + " years old.");
    }

    public void resetPassword() {
        System.out.println("Your old password was " + password + ". What would you like your new password to be?");
    }
}
