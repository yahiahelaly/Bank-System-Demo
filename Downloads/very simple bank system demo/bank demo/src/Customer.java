import java.util.ArrayList;
import java.util.List;

public class Customer {
 private String name;
    private List<Account> accounts = new ArrayList<>();
    public Customer(String name){
        this.name=name;
    }
    public void linkAccount(Account account) {
        accounts.add(account);
    }
 
    public List<Account> getAccounts() {
        return accounts;
    }

    public void deposit(int accountNumber, int amount) {
        Account account = findAccount(accountNumber);
        if (account == null) {
            System.out.println(name + " does not hold account #" + accountNumber);
            return;
        }
        account.deposit(amount);
    }
 
    public void withdraw(int accountNumber, int amount) {
        Account account = findAccount(accountNumber);
        if (account == null) {
            System.out.println(name + " does not hold account #" + accountNumber);
            return;
        }
        account.withdraw(amount);
    }
  private Account findAccount(int accountNumber) {
        for (Account a : accounts) {
            if (a.getAccountNumber() == accountNumber) {
                return a;
            }
        }
        return null;
    }
    public void checkBalance(Bank bank, int accountNumber) {
        for (Account a : bank.getAccounts()) {
            if (a.getAccountNumber() == accountNumber) {
                System.out.printf("%s's balance on account #%d: %.2f%n", name, accountNumber, a.getBalance());
                return;
            }
        }
        System.out.println("Account #" + accountNumber + " not found at this bank.");
    }
}


