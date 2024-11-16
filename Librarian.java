public class Librarian {
    public String librarianId;
    public static String name;
    public String email;
    public String contactNumber;

    public Librarian(String librarianId,String name,String email,String contactNumber){
        this.librarianId=librarianId;
        this.name=name;
        this.email=email;
        this.contactNumber=contactNumber;
    }
    public void addNewBook(Book book,Library library){
        library.addBook(book);
        System.out.println("Added new Book : "+book.getDetails());

    }
    public void removeBook(Book book,Library library){
        library.removeBook(book);
        System.out.println("Remove Book : "+book.getDetails());

    }
    public void issueBook(Book book,Member member){
        member.borrowBook(book);
        System.out.println(name+" issue a book "+book.getDetails()+" to "+member.name);

    }
    public static void receiveReturnedBook(Book book,Member member){
        member.returnBook(book);
        System.out.println(name+" receive a book "+book.getDetails()+" to "+member.name);

    }
}
