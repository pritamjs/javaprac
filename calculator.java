import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.println("Enter the first number:"); 
        int num1 = sc.nextInt(); 

        System.out.println("Enter the Second Number"); 
        int num2 = sc.nextInt();

        System.out.println("Welcome to the Menu Section! Please enter a number to get the specific result");
        System.out.println("1 - Sum"); 
        System.out.println("2 - Difference"); 
        System.out.println("3 - Product"); 
        System.out.println("4 - Division"); 

        int m = sc.nextInt();

        if(m == 1){
            System.out.println( num1+num2 ); 
        }

        else if( m == 2){
            System.out.println(num1 - num2); 
        }

        else if(m == 3){
            System.out.println(num1 * num2 ); 
        }

        else if(m == 4){
        System.out.println((double)num1 / num2 ); 
        }

        sc.close();

    }

    
}
