package patterns.builder;

public class PhoneBuildDirector {
  private PhoneBuilder builder;

  public PhoneBuildDirector(PhoneBuilder builder) {
    this.builder = builder;
  }

  public void setBuilder(PhoneBuilder builder) {
    this.builder = builder;
  }

  public Phone make(int width, int height) {
    builder.reset();
    builder.buildFrame(width, height);
    builder.setExtraFeatures();

    return builder.getPhone();
  }
}