package patterns.adapter;

public class RoundPhoneCaseAdapter extends PhoneCase {

  public RoundPhoneCaseAdapter(RoundPhoneCase roundPhoneCase) {
    double radius = roundPhoneCase.getRadius();
    double squareLength = Math.sqrt(Math.pow(radius, 2) * 2);
    setWidth(squareLength);
    setHeight(squareLength);
  }

}