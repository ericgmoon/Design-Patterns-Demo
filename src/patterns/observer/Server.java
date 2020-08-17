package patterns.observer;

public interface Server {
  public void subscribe(Subscriber subscriber);

  public void unsubscribe(Subscriber subscriber);
}