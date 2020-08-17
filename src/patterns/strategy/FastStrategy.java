package patterns.strategy;

public class FastStrategy implements BeepStrategy {

  @Override
  public void beep() {
    System.out.println("Beeping quickly...");
  }

}