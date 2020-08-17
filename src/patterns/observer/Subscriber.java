package patterns.observer;

public interface Subscriber {
  public void update(String sender);
}