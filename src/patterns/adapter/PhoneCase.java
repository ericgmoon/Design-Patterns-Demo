package patterns.adapter;

public class PhoneCase {
  protected double width;
  protected double height;

  public PhoneCase() {
    // Stub to allow super constructor to be called later on
  }

  public PhoneCase(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}