package patterns.builder;

public interface PhoneBuilder {
  public void reset();

  public void buildFrame(int width, int height);

  public void setExtraFeatures();

  public Phone getPhone();
}