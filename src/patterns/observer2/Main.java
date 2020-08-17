package patterns.observer2;

/**
 * This package is similar to the observer package, but implements the Observer
 * Pattern using independent listeners, which are more sustainable / flexible.
 * 
 * In this example, a phone subscribes to both calls and messages, whereas
 * tablets only subscribe to messages
 */
public class Main {
  public static void main(String args[]) {
    Phone phone = new Phone();
    Tablet tablet = new Tablet();

    CallServer callServer = new CallServer();
    MailServer mailServer = new MailServer();

    callServer.receiveCall("000-000-001");
    callServer.receiveMessage("000-000-001");
    mailServer.receiveMessage("001@gmail.com");

    phone.listen(callServer);

    callServer.receiveCall("000-000-002");
    callServer.receiveMessage("000-000-002");
    mailServer.receiveMessage("002@gmail.com");

    phone.listen(mailServer);
    tablet.listen(mailServer);

    mailServer.receiveMessage("003@gmail.com");
  }
}