package patterns.builder;

public class PremiumBuilder implements PhoneBuilder {

  private Phone phone;

  @Override
  public void reset() {
    phone = new Phone();
  }

  @Override
  public void buildFrame(int width, int height) {
    phone.setWidth(width);
    phone.setHeight(height);
  }

  @Override
  public void setExtraFeatures() {
    phone.setIsOLED(true);
    phone.setIsThin(true);
  }

  public Phone getPhone() {
    if (phone != null && phone.getWidth() != 0 && phone.getHeight() != 0) {
      return phone;
    } else {
      // TODO: Handle error
      return null;
    }
  }

}