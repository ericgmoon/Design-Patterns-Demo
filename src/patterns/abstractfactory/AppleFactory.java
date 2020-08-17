package patterns.abstractfactory;

public class AppleFactory implements Factory {

  @Override
  public Phone createPhone() {
    return new IPhone();
  }

  @Override
  public Tablet createTablet() {
    return new IPad();
  }

}