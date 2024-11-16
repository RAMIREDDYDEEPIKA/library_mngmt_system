import java.util.Date;

public class Fine {
    public String fineId;
    public Member member;
    public double amount;
    public Date issueDate;
    public boolean isPaid;
    public Fine(String fineId,Member member,double amount,Date issueDate,boolean isPaid){
        this.fineId=fineId;
        this.member=member;
        this.amount=amount;
        this.issueDate=issueDate;
        this.isPaid=isPaid;
    }
    public void calculateFine(Date dueDate,Date returnDate)
    {
        long diff = returnDate.getTime() - dueDate.getTime();
        long overdueDays = diff / (1000 * 60 * 60 * 24);
        if (overdueDays > 0) {
            this.amount = overdueDays * 2;
        }
    }
    public void markAsPaid()
    {
        System.out.println("pay the money through UPI or cash : ");
        boolean transaction=isPaid;
        if(!transaction){
            System.out.println("You didn't pay yet");
        }
        else{
            System.out.println(member+" paid the amount");
        }
    }
}
