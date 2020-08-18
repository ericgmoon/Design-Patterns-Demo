package patterns.adapter;

/**
 * The Adapter Pattern is used to adapt an object to match another object or
 * interface.
 *
 * In the following example, a phone case is said to be a good fit for a phone
 * if it is larger than the phone. Whilst the RoundPhoneCase can not be checked
 * directly, the RoundPhoneCaseAdapter adapts the RoundPhoneCase to type
 * PhoneCase by considering the maximum square fit inside the circular phone
 * case.
 */
public class Main {
  public static void main(String args[]) {
    Phone phone = new Phone(300, 500);
    PhoneCase smallCase = new PhoneCase(300, 400);
    PhoneCase largeCase = new PhoneCase(400, 500);
    RoundPhoneCase roundCase = new RoundPhoneCase(500);
    PhoneCase squaredRoundCase = new RoundPhoneCaseAdapter(roundCase);

    System.out.println("Small case fit: " + phone.isGoodFit(smallCase));
    System.out.println("Large case fit: " + phone.isGoodFit(largeCase));
    System.out.println("Squared round case fit: " + phone.isGoodFit(squaredRoundCase));
  }
}