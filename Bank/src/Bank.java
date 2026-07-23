
import java.util.ArrayList;


public class Bank {
   private  int Bank_code_number;
    String Bank_address;
    String Bank_name;
    private  ArrayList<Account>accounts;
    
    
    public Bank(int Bank_code_number,String Bank_address,String Bank_name ){
        this.Bank_code_number=Bank_code_number;
        this.Bank_address=Bank_address;
        this.Bank_name=Bank_name;
            accounts = new ArrayList<>();

    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void deleltAccount(Account account){
        accounts.remove(account);
        System.out.println("account delet");
    }
   
   
    
    }


