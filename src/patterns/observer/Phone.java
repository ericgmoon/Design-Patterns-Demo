package patterns.observer;

public class Phone implements Subscriber {

  @Override
  public void update(String sender) {
    System.out.println("Phone received call from " + sender);
  }

}