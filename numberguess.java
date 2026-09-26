import java.util.Scanner; 


public class numberguess {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int secret = 42; 
    System.out.println("Guess The Number ( 1 - 100 )");
    int guess = sc.nextInt(); 
    int i = 0; 

    if(guess < secret){
        System.out.println("Too low!");
    } else if(guess > secret){
        System.out.println("Too high!");
    }

    while(guess != secret){
        System.out.println("Try again ( 1 - 100 )");
        guess = sc.nextInt(); 

        if(guess<secret){
            System.out.println("guess is too low");
        }
        else if (guess > secret){
            System.out.println("guess is too high");
        }
        i++; 

    }
    System.out.println("Correct! You got it in " + i + " attempts!");
    sc.close(); 
}  
}
