//ex 10.2b
import java.util.*;

public class Transaction {
  public String sender;
  public String recipient;
  public float value;

  public Transaction(String from, String to, float value){
    this.sender = from;
    this.recipient = to;
    this.value = value;
  }
}
