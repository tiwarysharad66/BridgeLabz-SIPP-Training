package constructors;
class Books {
    public String ISBN;
    protected String title;
    private String author;

    public Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Books {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void showDetails() {
        System.out.println("ISBN: " + ISBN);         // public
        System.out.println("Title: " + title);       // protected
        // Cannot access private 'author' directly
    }
}
