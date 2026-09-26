class Rectangle {
    int length; 
    int width; 

    void area(){
        int area = length*width;
        System.out.println("area : "+ area);
    }

    void perimeter(){
        int perimeter = 2*(length+width);
        System.out.println("perimeter : "+ perimeter);
    }

    void displayinfo(){
        System.out.println("length : " +length);
        System.out.println("width : " + width);
    }
}


class exc1{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10; 
        rectangle.width = 20; 

        rectangle.displayinfo();
        rectangle.area();
        rectangle.perimeter();

        
    }
}