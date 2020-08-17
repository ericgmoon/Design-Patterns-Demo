package patterns.abstractfactory;

public class SamsungFactory implements Factory {

  @Override
  public Phone createPhone() {
    return new GalaxyPhone();
  }

  @Override
  public Tablet createTablet() {
    return new GalaxyTab();
  }

}