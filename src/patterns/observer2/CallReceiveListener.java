package patterns.observer2;

public interface CallReceiveListener extends ReceiveListener {
  @Override
  public void update(String sender);
}