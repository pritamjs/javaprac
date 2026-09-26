import java.util.Scanner; 

class machine{
    private String holdername; 
    private float balance;


    //_________________Constructor____________________________

    machine(String holdername, float balance){
        this.holdername = holdername; 
        this.balance = balance;
    }

    void withdraw(float amount){ 
        if(balance<=amount){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amount; 
            System.out.println("Current balance is" + balance);
        }
    }

    void deposit(float amount){
        balance = balance + amount; 
        System.out.println("Current balance is : " + balance);
    }
    

    //______________Getter Data________________________ 

    public  String getholdername(){
        return  holdername; 
    }
    public float getbalance(){
        return balance; 
    }

}


public class atm{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the holdername");
        String holdername = sc.next(); 

        System.out.println("Enter the initial balance");
        float balance = sc.nextFloat(); 

        machine m = new machine(holdername, balance); 

        System.out.println("The holdername is :" + m.getholdername());
        System.out.println("The balance is :" +m.getbalance());

        while (true) {
            System.out.println("1.Check the Balance");
            System.out.println("2.Check the Holdername");
            System.out.println("3.Deposit amount");
            System.out.println("4.Withdraw amount");
            System.out.println("5.Exit");

            int choice = sc.nextInt(); 

            switch (choice) {
                case 1:
                     System.out.println("Balance: " + m.getbalance());
                    break;
                case 2:
                    System.out.println("The holdername is : " + m.getholdername());
                    break;
                case 3:
                    System.out.println("Enter Amount");
                    float amount = sc.nextFloat();
                    m.deposit(amount);
                    break;
                case 4:
                    System.out.println("Enter the Amount");
                    amount = sc.nextFloat(); 
                    m.withdraw(amount);
                    break;
                case 5:
                    System.out.println("Exiting... Thank You !");
                    sc.close();
                    return;

                default : System.out.println("Invalid !");
            }
            
        }  

    }
    
}