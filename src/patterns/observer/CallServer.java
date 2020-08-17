package patterns.observer;

import java.util.HashSet;
import java.util.Set;

public class CallServer implements Server {

  Set<Subscriber> subscribers = new HashSet<Subscriber>();

  @Override
  public void subscribe(Subscriber subscriber) {
    subscribers.add(subscriber);
  }

  @Override
  public void unsubscribe(Subscriber subscriber) {
    subscribers.remove(subscriber);
  }

  public void receiveCall(String sender) {
    System.out.println("Call from " + sender + " received by call server");
    notifySubscribers(sender);
  }

  private void notifySubscribers(String sender) {
    for (Subscriber s : subscribers) {
      s.update(sender);
    }
  }

}