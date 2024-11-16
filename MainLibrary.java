import java.util.Date;

public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library("City Library", "123 Main Street");
        Book book1 = new Book("Java", "James", "12345", 1995,true);
        Book book2 = new Book("python", "Guido", "67890", 1989,true);
        Book book3 = new Book("c", "Denis", "11223", 1990,true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Librarian librarian = new Librarian("L1", "John Doe", "john.doe@library.com", "555-1234");

        Member member1 = new Member("M1", "Deepika", "456 Elm Street", "555-5678");
        Member member2 = new Member("M2", "Lakshmi", "789 Oak Street", "555-9101");

        library.registerMember(member1);
        library.registerMember(member2);

        System.out.println("Issuing book to member...");
        librarian.issueBook(book1, member1);
        System.out.println("\nReturning book...");
        librarian.receiveReturnedBook(book1, member1);

    }
}
