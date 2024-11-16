public class Member {
    public String memberId;
    public String name;
    public String address;
    public String contactNumber;
    public Member(String memberId,String name,String address,String contactNumber){
        this.memberId=memberId;
        this.name=name;
        this.address=address;
        this.contactNumber=contactNumber;
    }
    public void borrowBook(Book book){
        if (book.isAvailable) {
            book.borrowedBooks();
            book.updateAvailability(false);
            System.out.println(name + " borrowed book: " + book.getDetails());
        }
        else {
            System.out.println("Book is not available for borrowing: " + book.getDetails());
        }

    }
    public void returnBook(Book book){
        if (book.isAvailable) {
            book.updateAvailability(true);
            System.out.println(name + " returned book: " + book.getDetails());
        }
        else {
            System.out.println(name + " has not borrowed this book: " + book.getDetails());
        }

    }
}
