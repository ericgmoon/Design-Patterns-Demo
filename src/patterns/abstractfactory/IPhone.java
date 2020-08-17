package patterns.abstractfactory;

public class IPhone implements Phone {
  @Override
  public void beep() {
    System.out.println("Beeping like an iPhone!");
  }
}