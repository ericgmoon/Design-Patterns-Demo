package patterns.observer2;

public class MailServer implements Server {

  private ReceiveManager receiveManager = new ReceiveManager();

  public void receiveMessage(String sender) {
    System.out.println("Message from " + sender + " received by mail server");
    receiveManager.notifyListeners(CommunicationType.MESSAGE, sender);
  }

  @Override
  public void subscribe(ReceiveListener listener) {
    receiveManager.subscribe(listener);
  }

  @Override
  public void unsubscribe(ReceiveListener listener) {
    receiveManager.unsubscribe(listener);
  }

}