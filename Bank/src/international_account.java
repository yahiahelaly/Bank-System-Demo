public class international_account  extends Account{
    public double transction_fee=2.5% balance;
    public  international_account(String  name_of_holder,int  number_of_accoun,double balance){
        super( name_of_holder, number_of_accoun,balance);
        
    }
    public void settransction_fee(){
        transction_fee=2.5%balance;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
            return;
        }
        if (amount <= balance) {
            balance -= (amount+transction_fee);
            System.out.println("balance aftrer transtion:"+balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

}
