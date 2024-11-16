import java.util.ArrayList;
import java.util.List;

public class Library {
    public String name;
    public String address;
    public List<Book> books;
    public List<Member> members;
    public List<Librarian> librarians;

    public Library(String name,String address){
        this.name=name;
        this.address=address;
        this.books=new ArrayList<>();
        this.members=new ArrayList<>();
        this.librarians=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book details: "+book.getDetails());

    }
    public void removeBook(Book book){
        books.remove(book);
        System.out.println("After remove the Book : "+book.getDetails());

    }
    public void registerMember(Member member){
        members.add(member);
        System.out.println("Register member : "+member.name);

    }
    public void removeMember(Member member){
        members.remove(member);
        System.out.println("Remove member : "+member.name);

    }
    public List<Book> searchBook(String title){
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                foundBooks.add(book);
                System.out.println("Book found: " + book.getDetails());
            }
        }
        return foundBooks;

    }
    public List<Book> searchBookByAuthor(String author){
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(author)) {
                foundBooks.add(book);
                System.out.println("Book found: " + book.getDetails());
            }
        }
        return foundBooks;

    }
    public List<Book> listAvailableBooks(){
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable) {
                availableBooks.add(book);
                System.out.println("Available book: " + book.getDetails());
            }
        }
        return availableBooks;

    }

}
