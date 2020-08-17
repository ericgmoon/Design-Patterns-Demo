package patterns.strategy;

public class SlowStrategy implements BeepStrategy {

  @Override
  public void beep() {
    System.out.println("Beeping slowly...");
  }

}