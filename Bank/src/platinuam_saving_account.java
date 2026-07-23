public class platinuam_saving_account extends saving_account {
    public platinuam_saving_account(String  name_of_holder,int  number_of_accoun,double balance){
        super( name_of_holder, number_of_accoun,balance);
        

    }
    
     public   void set_Intersting_rate(){
        Intersting_rate=( 5) %balance;
        System.out.println("Intersting_rate"+Intersting_rate);
                balance+=Intersting_rate;
                        System.out.println("balnce after" +  "="  +(balance+Intersting_rate)); 


    }
    
    

}
