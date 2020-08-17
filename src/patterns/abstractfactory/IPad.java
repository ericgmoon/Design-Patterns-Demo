package patterns.abstractfactory;

public class IPad implements Tablet {
  @Override
  public void beep() {
    System.out.println("Beeping like an iPad!");
  }
}