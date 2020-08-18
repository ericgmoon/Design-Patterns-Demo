package patterns.visitor;

public class Screen implements PhonePart {
  private double width;
  private double height;

  public Screen(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
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