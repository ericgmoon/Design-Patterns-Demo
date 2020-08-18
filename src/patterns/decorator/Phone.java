package patterns.decorator;

public class Phone implements Device {

  @Override
  public double getPrice() {
    return 1000;
  }

  @Override
  public String getDescription() {
    return "This is a phone";
  }

}