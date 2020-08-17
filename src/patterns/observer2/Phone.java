package patterns.observer2;

public class Phone implements Device {

  @Override
  public void listen(Server server) {
    server.subscribe(new CallReceiveListener() {
      @Override
      public void update(String sender) {
        System.out.println("Phone received call from " + sender);
      }
    });
    server.subscribe(new MessageReceiveListener() {

      @Override
      public void update(String sender) {
        System.out.println("Phone received message from " + sender);
      }
    });
  }

}