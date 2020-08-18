package patterns.decorator;

public class PhoneAccessory implements Device {

  Device wrappee;

  public PhoneAccessory(Device wrappee) {
    this.wrappee = wrappee;
  }

  @Override
  public double getPrice() {
    return wrappee.getPrice();
  }

  @Override
  public String getDescription() {
    return wrappee.getDescription();
  }

}