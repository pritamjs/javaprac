
import java.util.Scanner;

public class scannerprac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.next();
        System.out.println("Your name is :" + name);

        System.out.println("enter your age");
        int age = sc.nextInt(); 
        System.out.println("Your age is :" + age); 

        System.out.println("Enter your city"); 
        String city = sc.next(); 
        System.out.println("Your city is " + city); 

        System.out.println("Hello" + name+"!" + "Aap" + age + "saal ke ho aur" + city + " mein rehte ho." );

        sc.close();

    }
    
}