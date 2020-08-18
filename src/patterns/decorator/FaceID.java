package patterns.decorator;

public class FaceID extends PhoneAccessory {

  public FaceID(Device wrappee) {
    super(wrappee);
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 100;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", with FaceID";
  }

}