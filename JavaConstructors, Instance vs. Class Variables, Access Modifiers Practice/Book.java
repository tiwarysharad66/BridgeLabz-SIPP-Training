package constructors;

public class Book {
    String title;
    String author;
    int price;
    Book(){
        title = "likewise Books";
        author  = "Sharad Kumar";
        price = 450;
    }
    Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price= price;
    }
    void display(){
        System.out.println(" the title is " + title + " author "+ author + " price " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
        b1.price = 45;
        b1.author = "sharad kumar";
        b1.title = " river side ";
        b1.display();
    }
}
