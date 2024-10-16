package Automat;

import java.util.Random;

public class Ticket {

    private long creationTime;
    private long payedOutTime;
    private Random randID = new Random();

    public Ticket(long creationTime, long payedOutTime, Random randID) {
        this.randID = randID;
        this.creationTime = System.currentTimeMillis();
        this.payedOutTime = System.currentTimeMillis();
    }

    public Random getid() {
        return randID;
    }

    public long getcreationTime() {
        return creationTime;
    }

    public long getpayedOutTime() {
        return payedOutTime;
    }

    @Override
    public String toString() {
        return "ID:" + randID + " PayedOutTimestamp:" + payedOutTime + " CreateionTimestamp:" + creationTime;

    }
}
