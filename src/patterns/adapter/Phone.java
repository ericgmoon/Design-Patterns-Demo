package patterns.adapter;

public class Phone {
  private double width;
  private double height;

  public Phone(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public boolean isGoodFit(PhoneCase phoneCase) {
    if (phoneCase.getWidth() >= width && phoneCase.getHeight() >= height)
      return true;
    else
      return false;
  }
}