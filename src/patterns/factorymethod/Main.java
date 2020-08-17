package patterns.factorymethod;

/**
 * The Factory Method Pattern is used to delegate the instantiation of objects
 * to a separate class. This delegation is achieved using factory methods.
 * 
 * This method enables conditional instantiation and for the logic behind the
 * creation of objects to be separated from the main logic.
 *
 * In the following example, the Main class is able to create a phone and tablet
 * WITHOUT knowing the specific logic (in this example, the price of the device)
 * behind the creation of the phone.
 */
public class Main {
  public static void main(String args[]) {
    ElectronicFactory phoneFactory = new PhoneFactory();
    Electronic phone = phoneFactory.create();

    ElectronicFactory tabletFactory = new TabletFactory();
    Electronic tablet = tabletFactory.create();

    System.out.println("The phone is $" + phone.getPrice());
    phone.beep();

    System.out.println("The tablet is $" + tablet.getPrice());
    tablet.beep();
  }
}