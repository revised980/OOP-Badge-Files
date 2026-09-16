package OOP.accounts;

import OOP.accounts.UserAccount;

public class AccountsRunner1 {
    public static void main(String[] args) {
        // 4. Fill in the blanks below for Bill, a UserAccount with username 'bill' and password 'Password123'. 
        //  Then, write a program which involves calling both of Bill's methods.  
        UserAccount bill = new UserAccount("Bill", "Password123", 10, 20); 
        bill.comment();
        bill.resetPassword();
        // 5. After all of that, create another user. Fill in the blank below for a program which asks the user for a username/password, and checks 
        UserAccount dave = new UserAccount("Dave", "DaveIsTheBest123", 5, 25);
        dave.comment();
        dave.resetPassword();
    }
}


