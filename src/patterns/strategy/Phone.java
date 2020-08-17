package patterns.strategy;

public class Phone {
  private BeepStrategy strategy;

  public void setBeepStrategy(BeepStrategy strategy) {
    this.strategy = strategy;
  }

  public void ring() {
    if (strategy != null) {
      strategy.beep();
    } else {
      // TODO: Handle error
    }
  }
}