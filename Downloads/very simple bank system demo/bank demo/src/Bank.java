import java.util.ArrayList;
import java.util.List;

public class Bank {
    public  int bank_id;
    public String branch_name;
    public int branch_id;
    private List<Account> accounts = new ArrayList<>();
    public String branch_address;

    public Bank( int bank_id,String branch_name,int branch_id,String branch_address){
      this.bank_id=bank_id  ;
      this.branch_name=branch_name;
      this.branch_id=branch_id;
      this.branch_address=branch_address;
    }
     public Account createAccount(int accountNumber, String holderName, String accountType, double initialBalance) {
        Account account = new Account(accountNumber, holderName, accountType, initialBalance);
        accounts.add(account);
        System.out.println("Account created: " + account);
        return account;
    }
     public void removeAccount(int accountNumber) {
        accounts.removeIf(a -> a.getAccountNumber() == accountNumber);
        System.out.println("Account #" + accountNumber + " removed.");
    }
 
      public List<Account> getAccounts() {
        return accounts;
    }
  @Override
    public String toString() {
        return String.format("Bank[id=%d, branch=%d, name=%s]", bank_id, branch_id, branch_name);
    }


}
