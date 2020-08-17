package patterns.builder;

public class CheapBuilder implements PhoneBuilder {

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
    phone.setIsOLED(false);
    phone.setIsThin(false);
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