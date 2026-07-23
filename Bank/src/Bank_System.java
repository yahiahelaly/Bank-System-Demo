public class Bank_System {
    public static void main(String[] args) throws Exception {        // Create a new bank
        Bank basyon = new Bank(123, "23 july street, basyon, gharbia", "cib_basyon");
        System.out.println("=== Bank Created ===");
        System.out.println("Bank Name: " + basyon.Bank_name);
        System.out.println("Bank Address: " + basyon.Bank_address);
        System.out.println();

    
        Account yaya = new Account("yaya", 12, 70000);
        basyon.addAccount(yaya);
        System.out.println("=== Basic Account Created ===");
        yaya.show_detilas();
        System.out.println();

        
        saving_account noor = new saving_account("noor", 13, 5000);
        basyon.addAccount(noor);
        System.out.println("=== Saving Account Created ===");
        noor.show_detilas();
        noor.set_Intersting_rate(3);
        System.out.println();

       
        international_account most = new international_account("mos", 1231, 7000);
        basyon.addAccount(most);
        System.out.println("=== International Account Created ===");
        most.show_detilas();
        most.withdraw(500);
        System.out.println();

        
        platinuam_saving_account pip = new platinuam_saving_account("pip", 123, 5000);
        basyon.addAccount(pip);
        System.out.println("=== Platinum Saving Account Created ===");
        pip.show_detilas();
        pip.set_Intersting_rate(2.5);
        System.out.println();

        
        Gold_saving_account gold = new Gold_saving_account("gold_user", 456, 10000);
        basyon.addAccount(gold);
        System.out.println("=== Gold Saving Account Created ===");
        gold.show_detilas();
        System.out.println();

        
        silver_saving_account silver = new silver_saving_account("silver_user", 789, 8000);
        basyon.addAccount(silver);
        System.out.println("=== Silver Saving Account Created ===");
        silver.show_detilas();
        System.out.println();

        
        current_Account current = new current_Account("current_user", 321, 15000);
        basyon.addAccount(current);
        System.out.println("=== Current Account Created ===");
        current.show_detilas();
        System.out.println();

        
        System.out.println("=== Performing Transactions ===");
        yaya.deposit(5000);
        System.out.println("Yaya deposited 5000");
        yaya.show_balance();
        System.out.println();

        yaya.withdraw(2000);
        System.out.println("Yaya withdrew 2000");
        yaya.show_balance();
        System.out.println();

        System.out.println("=== Bank System Demo Complete ===");

        

       
    }
}
