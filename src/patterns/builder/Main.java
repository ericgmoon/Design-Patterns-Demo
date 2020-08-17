package patterns.builder;

/**
 * The Builder Pattern is used to delegate the details of how an object is built
 * (often one which is complex, such that it requires multiple steps)
 *
 * In the following example, a cheap and expensive phone are created from two
 * builders. The builders build the phone directed by the PhoneBuildDirector,
 * which further abstracts the build details.
 */
public class Main {
  public static void main(String args[]) {
    PhoneBuilder cheapBuilder = new CheapBuilder();
    PhoneBuilder premiumBuilder = new PremiumBuilder();

    PhoneBuildDirector director = new PhoneBuildDirector(null);

    director.setBuilder(cheapBuilder);
    Phone cheapPhone = director.make(300, 500);

    director.setBuilder(premiumBuilder);
    Phone premiumPhone = director.make(500, 800);

    cheapPhone.beep();
    premiumPhone.beep();
  }
}