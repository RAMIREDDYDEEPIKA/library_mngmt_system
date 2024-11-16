import java.util.Date;

public class Transaction {
    public String transactionId;
    public Member member;
    public Book book;
    public Date issueDate;
    public Date returnedDate;
    public boolean isReturned;
    public Transaction(String transactionId,Member member,Book book,Date issueDate,Date returnedDate,boolean isReturned){
        this.transactionId=transactionId;
        this.member=member;
        this.book=book;
        this.issueDate=issueDate;
        this.isReturned=isReturned;
        this.returnedDate=returnedDate;
    }
    public void markAsReturned(){
        this.isReturned = true;

    }
    public String getTransactionDetails(){
        return "Transaction ID: " + transactionId + ", Member: " + member.name + ", Book: " + book.title +
                ", Issue Date: " + issueDate + ", Return Date: " + (returnedDate == null ? "Not Returned" : returnedDate);
    }
}
