public class CreateAcc {
    public static void main(String[] args) {
        //Variable           = Value
        //Variable           -> Id: 123FFD
        Account firstAccount = new Account(); // This firstAccount is an object of the class Account and is going to represent a "new" account.
        firstAccount.balance = 200; // This is how we access the attributes of the class Account.
        System.out.println(firstAccount.balance);

        Account secondAccount = new Account();
        secondAccount.balance = 50;
        System.out.println(secondAccount.balance);
        System.out.println(secondAccount.agency);
        System.out.println(firstAccount);
        System.out.println(secondAccount);

    }
}
