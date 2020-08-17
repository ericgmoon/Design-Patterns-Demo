package patterns.abstractfactory;

public class GalaxyPhone implements Phone {
  @Override
  public void beep() {
    System.out.println("Beeping like a galaxy phone!");
  }
}