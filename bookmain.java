class Book{
    String author; 
    String title;
    float price;


    Book(String title){
        this.title = title;
        this.author = "unknown";
        this.price = 0; 
    }
    Book(String author, String title){
        this.title = title;
        this.author = author;
        this.price = 0;
    }
    Book(String author, String title, float price){
        this.author = author; 
        this.title = title; 
        this.price = price; 

    }

    void displayinfo(){
        System.out.println("Author :" + author);
        System.out.println("Title : "+ title); 
        System.out.println("Price :" + price); 
    }

}
public class bookmain{

    public static void main(String[] args){
        Book book1 = new Book("house of the dragon");
        Book book2 = new Book ("RN Murtin", "House of the Dragon");
        Book book3 = new Book ("RN murtin", "house of the dragon", 25.05f); 

        book1.displayinfo();
        book2.displayinfo();
        book3.displayinfo();
    }
}
