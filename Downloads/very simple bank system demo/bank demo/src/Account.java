public class Account {
 private  int Account_number;
 private String holder_name; 
 private String Account_type;
 private double balance;
public Account(int accountNumber, String holderName, String accountType, double balance){
    if(balance<=0){
        System.out.println("balance must be greather than zero");
        return;
    }
    this.Account_number = accountNumber;
    this.holder_name = holderName;
    this.Account_type = accountType;
    this.balance = balance;
}
  public void deposit (double amount){
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
    }
       public void withdraw(double  amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.println("balance after  withdraw : "+balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public double getBalance() {
        return balance;
    }
     public int getAccountNumber() {
        return Account_number;
    }
     public String getHolderName() {
        return holder_name;
    }
 
    public String getAccountType() {
        return Account_type;
    }
    @Override
public String toString() {
    return String.format("Account[#%d, holder=%s, type=%s, balance=%.2f]",
           Account_number, holder_name, Account_type, balance);
}
}
