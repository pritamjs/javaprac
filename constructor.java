class Car{
    String brand; 
    String color; 
    int speed; 


    Car(){
        this.brand = "unknown"; 
        this.color = "white"; 
        this.speed = 0; 
        System.out.println("succesfully fetched1");
    }

    Car(String brand, String color, int speed){
        this.brand= brand; 
        this.color = color; 
        this.speed = speed;
        System.out.println("succesfully fetched");
    }

    void displayinfo(){
        System.out.println("brand : " + brand);
        System.out.println("color : " + color);
        System.out.println("speed : "+ speed);

    }

    void isfast(){
        if(speed>100){
            System.out.println("fast car!");
        }
        else{
            System.out.println("slow car");
        }

    }

}


public class constructor{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","white",110);
        Car car2 = new Car(); 
        
        car1.displayinfo();
        System.out.println("--------------");
        car2.displayinfo();
        System.out.println("--------------");

        car1.isfast();
        car2.isfast();
        
    }

}