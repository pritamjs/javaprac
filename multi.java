import java.util.Scanner;


public class multi{
    public static void main(String[] arga){

        int multi = 1; 

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Number : "); 
        int num = sc.nextInt(); 

        for(int i = 1; i<=10; i++){

            multi = num*i; 
            System.out.println(num + "X" + i + "=" + multi);


        }

        sc.close();

    }
}