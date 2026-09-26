import java.util.Scanner;

class productinventory{
    private String name; 
    private float price; 
    private int quantity; 


    productinventory(String name, float price, int quantity){ 
        this.name = name; 
        if(price<=0){
            System.out.println("Invalid data");
        }
        else{
            this.price = price; 
        }

        if(quantity<= 0){
            System.out.println("INVALID DATA ");
        }
        else{
            this.quantity = quantity; 
        }
    }

    void sell(int qty){
        if(quantity<qty){
            System.out.println("Not enought Stock ");
        }
        else{
            quantity = quantity - qty; 
            System.out.println("current quantuty is : " + quantity);
        }
    }

    void restock (int qty){ 
        quantity = quantity + qty; 
        System.out.println("Current quantity after increasing is : " + quantity);
    }

    void changeprice(float amount){
        price = amount; 
        System.out.println("Latest amount is: " + amount );

    }


    String getname(){
        return name; 
    }

    float getprice(){
        return price; 
    }

    int getquantity(){
        return quantity; 
    }

}

public class proinv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Product Name? ");
        String name = sc.next();
        
        System.out.println("Item Quantity");
        int quantity = sc.nextInt(); 

        System.out.println("What is the item price?");
        float price = sc.nextFloat(); 

        productinventory e = new productinventory(name, price, quantity); 

        while(true){

            System.out.println("___________ Please Seclect between from 1 to 5 __________"); 
            System.out.println("1. Sell");
            System.out.println("2. Restock"); 
            System.out.println("3. Display Info"); 
            System.out.println("4. Change Price"); 
            System.out.println("5. Exit"); 

            int choice  = sc.nextInt();

            if(choice == 1){
                System.out.println("Great! You have choosen choice 1 : "); 
                System.out.println("Enter the sell quantity"); 
                int qty = sc.nextInt(); 
                e.sell(qty);

            }

            else if(choice == 2){
                System.out.println("Excelent! you have choice two");
                System.out.println("tell the item of restock");
                int qty = sc.nextInt();
                e.restock(qty);
            }

            else if( choice == 3){ 
                System.out.println("Awesome! You have choice Three");
                System.out.println("Here is All your information");
                System.out.println("______________________________");
                System.out.println("Name is :" + e.getname());
                System.out.println("Price is :" + e.getprice());
                System.out.println("Quantity is :" + e.getquantity());
            
            }

            else if(choice == 4){
                System.out.println("Awesome! You have choice Four");
                System.out.println("Please tell the amount");
                float amount = sc.nextFloat(); 
                e.changeprice(amount);
                System.out.println("Amount succesfully changed! Thank you");

            }

            else if(choice == 5){ 
                System.out.println("Thank you for your time ! See you Soon !");
                sc.close();
                return; 
            }

        }

    }
    
}
