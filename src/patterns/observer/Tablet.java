package patterns.observer;

public class Tablet implements Subscriber {

  @Override
  public void update(String sender) {
    System.out.println("Tablet received call from " + sender);
  }

}