package patterns.singleton;

/**
 * The Singleton Pattern is used to create a shared instance of a class.
 * 
 * This benefit of this pattern over creating a static class is that it can
 * implement interfaces (unlike static classes, which can only implement static
 * methods and hence unable to implement non-static interfaces).
 *
 * In the following example, instances of Phone are created and their sharing of
 * attributes is demonstrated.
 */
public class Main {
  public static void main(String args[]) {
    Phone phone = Phone.getInstance();

    phone.beep();
    phone.click();

    // The following line can not be run as the constructor is private.
    // Phone newPhone = new Phone();

    Phone samePhone = Phone.getInstance();

    samePhone.beep();

    samePhone.click();
    samePhone.beep();
    phone.beep();
  }
}