public class transaction  extends Account{
    public double amount;
    public transaction(String  name_of_holder,int  number_of_accoun,double balance){
        super(name_of_holder, number_of_accoun, balance);
        this.amount=amount;
    }
    
     public void deposit (int amount){
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
    }
    



}
