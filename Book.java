import java.util.*;

public class Book {
    public String title;
    public String author;
    public String ISBN;
    public int publicationYear;
    public boolean isAvailable;
    public List<Book> borrowedBooks;
    public Book(String title,String author,String ISBN,int publicationYear,boolean isAvailable){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.publicationYear=publicationYear;
        this.isAvailable=isAvailable;
        this.borrowedBooks=new ArrayList<>();
    }
    public  void updateAvailability(boolean status){
        isAvailable=status;
        System.out.println("Book Availability update "+title+" are now  "+(isAvailable ? "available" : "unavailable"));

    }
    public String getDetails(){
        return title+" by author "+author+" and ISBN "+ISBN;
    }
    public List<Book> borrowedBooks(){
        System.out.println(Librarian.name + "'s borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println(" - " + book.getDetails());
        }
        return borrowedBooks;

    }
}
