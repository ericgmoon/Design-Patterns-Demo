package patterns.decorator;

public class OLEDScreen extends PhoneAccessory {

  public OLEDScreen(Device wrappee) {
    super(wrappee);
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 200;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", with an OLED screen";
  }

}