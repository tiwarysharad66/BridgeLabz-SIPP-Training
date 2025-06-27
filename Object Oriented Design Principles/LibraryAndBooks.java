import java.util.*;

class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) System.out.println(" - " + b);
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("Town Library");

        lib1.addBook(b1);
        lib2.addBook(b1);
        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}