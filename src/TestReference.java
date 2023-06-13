public class TestReference {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 300;

        Account secondAccount = firstAccount;
        secondAccount.balance += 100;
        System.out.println(firstAccount.balance);
        System.out.println(firstAccount);
        System.out.println(secondAccount);
    }
}
