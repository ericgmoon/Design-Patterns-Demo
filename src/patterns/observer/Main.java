package patterns.observer;

/**
 * The Observer Pattern is used to achieve low coupling via making one class
 * execute methods in other classes without calling them directly.
 *
 * In the following example, the call server receives calls. When a Phone/Tablet
 * is subscribed to the call server, they are notified.
 */
public class Main {
  public static void main(String args[]) {
    Phone phone = new Phone();
    Tablet tablet = new Tablet();

    CallServer server = new CallServer();

    server.receiveCall("123-456-789");

    server.subscribe(phone);

    server.receiveCall("000-000-000");

    server.subscribe(tablet);

    server.receiveCall("987-654-321");
  }
}