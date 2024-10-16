package TicketAutomat;

import java.util.Random;

public class Ticket {
    private int id;
    private long createdTimestamp;
    private long paidTimeStamp;
    private boolean isPayed = false;
    private Random random = new Random();

    public Ticket() {
        this.id = random.nextInt();
        this.createdTimestamp = System.currentTimeMillis();
        this.paidTimeStamp = -1;
    }

  public long getCreatedTimestamp() {
      return createdTimestamp;
  }

  public int getId() {
      return id;
  }

  public long getPaidTimeStamp() {
      return paidTimeStamp;
  }

  public void setPaidTimeStamp(long paidTimeStamp) {
      this.paidTimeStamp = paidTimeStamp;
  }

  public String toString(){
    return "ID" + id + "PayedTimestamp" + paidTimeStamp + "Created Ticket";
  }
}
