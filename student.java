import java.util.Scanner;

class Students {
    private String name; 
    private int age; 
    private int marks; 

    Students(String name, int age, int marks){ 
    this.name = name; 
    if(age<10 || age>100){ 
        System.out.println("Invalid Age");
    }

    else{
        this.age = age;
    }

    if(marks<0 || marks>100){ 
        System.out.println("Invalid marks");
    } 
    else{
        this.marks = marks; 
    }
 }

void isPass(){
    if(marks>=40){
        System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }

}

//Getter 

public String getName(){
    return  name; 
}
public int getage(){
    return age; 
}
public int getmarks(){
    return marks; 
}

}



public class student {
    public static void main(String [] args){ 

        Scanner sc = new Scanner (System.in);  

        System.out.println("Enter the name");
        String name = sc.next(); 

        System.out.println("Enter the Marks");
        int marks = sc.nextInt(); 

        System.out.println("Enter the age");
        int age = sc.nextInt(); 

        Students s = new Students(name, age, marks);

        System.out.println( "Name : " + s.getName());
        System.out.println("Age : " + s.getage()); 
        System.out.println("Marks : " + s.getmarks());
        s.isPass();

        sc.close();

    }
    
}
