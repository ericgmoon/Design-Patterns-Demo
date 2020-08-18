package patterns.visitor;

public class Camera implements PhonePart {
  private double aperture;

  public Camera(double aperture) {
    this.aperture = aperture;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public double getAperture() {
    return aperture;
  }

  public void setAperture(double aperture) {
    this.aperture = aperture;
  }
}