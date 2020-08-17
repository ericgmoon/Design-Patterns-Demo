package patterns.abstractfactory;

public class GalaxyTab implements Tablet {
  @Override
  public void beep() {
    System.out.println("Beeping like a galaxy tablet!");
  }
}