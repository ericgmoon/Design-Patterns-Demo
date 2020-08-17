package patterns.strategy;

/**
 * The Strategy Pattern is used to abstract different (conditional) behaviour by
 * a particular object.
 * 
 * Rather than implementing each behaviour in one class, this is abstracted into
 * different strategies.
 *
 * In the following example, the Phone (context class) rings in different ways
 * depending on the strategy applied.
 */
public class Main {
  public static void main(String args[]) {
    Phone phone = new Phone();

    phone.setBeepStrategy(new FastStrategy());
    phone.ring();

    phone.setBeepStrategy(new SlowStrategy());
    phone.ring();
  }
}