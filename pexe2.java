
class Student{

    private String name; 
    private int age; 
    private int marks; 


    public String getname(){
        return name; 
    }
    public int getage(){
        return age;
    }
    public int getmarks(){
        return marks;
    }

    public void setname(String name){
        this.name = name;
        System.out.println("Name Set :" + name);
    }

    public void setage(int age){
        if(age<5 || age>100)
            {
                System.out.println("Invalid while setting age");

            }
        else
        { 
            this.age = age;
        }
    }

    public void setmarks(int marks){
        if(marks<0 || marks>100){
            System.out.println("Invalid while setting marks");
        }

        else{
            this.marks = marks;
        }
    }

}


public class pexe2 {
    public static void main(String[] args) {

        Student sc = new Student();
        sc.setname("sayan");
        sc.setage(23);
        sc.setmarks(80);

        System.out.println(sc.getage());
        System.out.println(sc.getmarks());
        System.out.println(sc.getname());
        
    } 
    
}
