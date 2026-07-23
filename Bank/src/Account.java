import java.util.ArrayList;

public class Account  {
     private String  name_of_holder;
     private int  number_of_accoun;
     protected   double balance;
         private ArrayList<transaction> transactions;

    public Account(String  name_of_holder,int  number_of_accoun,double balance){
        if(balance<=0){
            System.out.println("balance must be greather than zero");
            return;
        }
        this.name_of_holder=name_of_holder;
        this.number_of_accoun=number_of_accoun;
        this.balance=balance;
        transactions=new ArrayList<>();
        System.out.println("balance"+balance);
    }
    
    
     public void deposit (int amount){
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
    }
       public void withdraw(double amount) {
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

    public void   show_balance(){
        System.out.print("balnce"+balance); 
    }
    public void show_detilas(){
         System.out.println("balnce  =   " + balance);
        System.out.println("name_of_holder "+"is "+name_of_holder); 
        System.out.println("number_of_accoun " +"is   "+number_of_accoun); 
    }



}
