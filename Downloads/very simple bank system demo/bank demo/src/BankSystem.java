public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank(2,"ytry",2,"yt");
 
        Account acc1 = bank.createAccount(1001, "Yaya", "Savings", 6000);
        Account acc2 = bank.createAccount(1002, "Yaya", "Checking", 7000);
 
        Customer customer = new Customer("Yaya");
        customer.linkAccount(acc1);
        customer.linkAccount(acc2);
 
        System.out.println("\nTransactions");
        customer.deposit(10, 150);
        customer.withdraw(1001, 50);
        customer.withdraw(1002, 1000); 
        customer.withdraw(9999, 10);   
 
       
 
        System.out.println("\n Customer's accounts ");
        for (Account a : customer.getAccounts()) {
            System.out.println(a);
        }
 
        System.out.println("\n Bank's accounts ");
        for (Account a : bank.getAccounts()) {
            System.out.println(a);
        }
    }
}