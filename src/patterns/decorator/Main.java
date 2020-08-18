package patterns.decorator;

/**
 * The Decorator Pattern is used to attach new behaviour to objects by placing
 * objects inside wrapper objects with certain behaviours.
 * 
 * This method allows objects to be created with different combinations of
 * features without having to create a subclass for each combination.
 *
 * In the following example, a Phone is created, then placed inside a wrapper
 * with FaceID, which is then placed inside a wrapper for OLED screen, then for
 * a smart pen. It can be observed that the object as a whole demonstrates
 * different behaviour depending on what it is being decorated by.
 */
public class Main {
  public static void main(String args[]) {
    Phone phone = new Phone();

    System.out.println("Price is: $" + phone.getPrice());
    System.out.println(phone.getDescription());

    FaceID phoneWithFaceID = new FaceID(phone);

    System.out.println("Price is: $" + phoneWithFaceID.getPrice());
    System.out.println(phoneWithFaceID.getDescription());

    OLEDScreen phoneWithOLED = new OLEDScreen(phoneWithFaceID);
    SmartPen premiumPhone = new SmartPen(phoneWithOLED);

    System.out.println("Price is: $" + premiumPhone.getPrice());
    System.out.println(premiumPhone.getDescription());
  }
}