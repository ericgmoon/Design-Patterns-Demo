package patterns.observer2;

public class Tablet implements Device {
  @Override
  public void listen(Server server) {
    server.subscribe(new MessageReceiveListener() {

      @Override
      public void update(String sender) {
        System.out.println("Tablet received message from " + sender);
      }
    });
  }
}