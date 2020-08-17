package patterns.factorymethod;

public class Tablet implements Electronic {

  private double price;

  public Tablet(double price) {
    this.price = price;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public void beep() {
    System.out.println("Beeping like a tablet!");
  }

}