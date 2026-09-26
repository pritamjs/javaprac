import java.util.Scanner;

class employee{
    private String name; 
    private String department; 
    private int salary; 

    employee(String name, String department, int salary){
        this.name = name; 
        this.department = department; 
        if (salary<=0){
            System.out.println("Enter valid amount");
        }
        else{
            this.salary = salary; 
            System.out.println("Salary Setup succesfully");
        }
    }

    void appraisal(float percent){
        float hike = salary * percent / 100;
        salary = salary + (int)hike;
        System.out.println("New salary: " + salary);
    }

    void setsalary(int amount){
        salary = salary + amount; 
        System.out.println("The hiked new salary is :" + salary); 
    }

    // ____________Getter_______________
    public String getname(){ 
        return  name; 
    }
    public String getDepartment(){
        return department;
    }
    public int getsalary(){
        return salary; 
    }

}


public class Employeemanager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String name = sc.next();
        System.out.println("Enter the department : ");
        String department = sc.next(); 
        System.out.println("Set the Salary ");
        int salary = sc.nextInt(); 
        

        employee e = new employee(name, department, salary); 



        while (true) {
            System.out.println("1. Display Info");
            System.out.println("2.Give Appraisal");
            System.out.println("3.change Salary"); 
            System.out.println("4.Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The name is :" + e.getname());
                    System.out.println("The department is :"+ e.getDepartment());
                    System.out.println("The salary is :" + e.getsalary()); 
                    break;
                
                case 2: 
                    System.out.println("Enter the percentage");
                    float percentage = sc.nextFloat(); 
                    e.appraisal(percentage);
                    break; 
                
                case 3:
                    System.out.println("Enter the amount");
                    int amount = sc.nextInt(); 
                    e.setsalary(amount);
                    break; 

                case 4: 
                    System.out.println("Good Bye !");
                    sc.close();
                    return; 
            
                default:System.out.println("Invalid");
                    break;
            }
            
        }
        
    }

}
