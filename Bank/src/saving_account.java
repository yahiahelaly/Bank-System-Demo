public class saving_account extends Account {
    public double Intersting_rate;
    public saving_account(String  name_of_holder,int  number_of_accoun,double balance){
        super( name_of_holder, number_of_accoun,balance);
        

    }
    public   void set_Intersting_rate(double  number){
        Intersting_rate=( number) ;
        System.out.println("Intersting_rate"+Intersting_rate + "%"  );
            double new_balance = balance +(balance * Intersting_rate /100);
                        System.out.println("balnce after" +  "="  +new_balance); 


    }
        
    
    
    
  


}
