package Automat;

public class Ticket {

    private int randomID = (int)(Math.random() * 10001);
    private long creationTime;
    private long payedOutTime;

    public Ticket(int randomID, long creationTime, long payedOutTime) {
        this.randomID = randomID;
        this.creationTime = creationTime;
        this.payedOutTime = payedOutTime;
    }

    public int getid() {
        return randomID;
    }

    public long getcreationTime() {
        return creationTime;
    }

    public long getpayedOutTime() {
        return payedOutTime;
    }
}
