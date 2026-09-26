import java.util.Scanner;


public class agec {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your age : ");
        int age = sc.nextInt(); 


        if(age<=12){
            System.out.println("Child");
        }
        else if(age<=19){
            System.out.println("Teen");
        }
        else if(age<=59){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior citigen");
        }

        sc.close(); 

    }
}
