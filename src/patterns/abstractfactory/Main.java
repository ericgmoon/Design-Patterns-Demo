package patterns.abstractfactory;

/**
 * The Abstract Factory Pattern is used to create families of objects without
 * knowing the specific implementation (or which objects belong in each family).
 * This method also allows new families to be created and for code to adapted to
 * new requirements quickly.
 *
 * In the following example, the Main class is able to create a phone and tablet
 * by Apple and Samsung respectively very easily without knowing specifically
 * which phone and tablet is produced by each company.
 */
public class Main {
  public static void main(String args[]) {
    Factory appleFactory = new AppleFactory();
    Phone iphone = appleFactory.createPhone();
    Tablet ipad = appleFactory.createTablet();

    Factory samsungFactory = new SamsungFactory();
    Phone galaxyphone = samsungFactory.createPhone();
    Tablet galaxytab = samsungFactory.createTablet();

    iphone.beep();
    ipad.beep();
    galaxyphone.beep();
    galaxytab.beep();
  }
}