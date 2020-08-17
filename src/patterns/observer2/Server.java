package patterns.observer2;

public interface Server {
  public void subscribe(ReceiveListener listener);

  public void unsubscribe(ReceiveListener listener);
}