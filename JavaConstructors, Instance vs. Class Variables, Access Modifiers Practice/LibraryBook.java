package constructors;

public class LibraryBook {
    String title;
    String author;
    int price;
    boolean availability;
    LibraryBook(String title,String author,int price,boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    LibraryBook(){
        title = "Kalinga";
        author = "sharad kumar";
        price = 450;
        availability = true;
    }
   void borrow(boolean availability){
        if(availability){
            availability = false;
            System.out.println("Borrowed");
        }
        else{
            System.out.println("Not available");
        }
   }
}
