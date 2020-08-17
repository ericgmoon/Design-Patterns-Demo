package patterns.observer2;

public interface MessageReceiveListener extends ReceiveListener {
  @Override
  public void update(String sender);
}