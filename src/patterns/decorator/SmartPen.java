package patterns.decorator;

public class SmartPen extends PhoneAccessory {

  public SmartPen(Device wrappee) {
    super(wrappee);
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 80;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", with a smart pen";
  }

}