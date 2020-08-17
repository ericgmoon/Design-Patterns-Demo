package patterns.observer2;

public class CallServer implements Server {

  private ReceiveManager receiveManager = new ReceiveManager();

  public void receiveMessage(String sender) {
    System.out.println("Message from " + sender + " received by call server");
    receiveManager.notifyListeners(CommunicationType.MESSAGE, sender);
  }

  public void receiveCall(String sender) {
    System.out.println("Call from " + sender + " received by call server");
    receiveManager.notifyListeners(CommunicationType.CALL, sender);
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