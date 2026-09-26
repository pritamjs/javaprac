class Bankaccountdata{
    String accountholder; 
    float balance; 

    Bankaccountdata(String accountholder, float balance){
        this.accountholder = accountholder; 
        this.balance = balance; 
    }

    void displayinfo(){
        System.out.println("accountholder : " + accountholder);
        System.out.println("balance : "+ balance); 
    }

    void deposit(int amount){
        balance = balance + amount;
        System.out.println("new balance is :" + balance+ "after addding" + amount ); 
    }

    void withdraw(int amount){
        if(balance<amount){
            System.out.println("Insufficient balance!");
        }
        else{
            balance = balance - amount; 
            System.out.println("Current balance is :" + balance + "after withdraw amount : " + amount);
        }
    }

    void displaybalance(){
        System.out.println("Current balance is :" + balance); 
    }
}


public class bankaccount{
    public static void main(String[] args){
        Bankaccountdata bank1 = new Bankaccountdata("sayan", 100);
        bank1.displayinfo(); 
        bank1.displaybalance();

        bank1.deposit(20);
        bank1.withdraw(90);
    }

}