package patterns.singleton;

public class Phone {
  private int clicks = 0;
  private static Phone instance;

  private Phone() {
    // Private stub to prevent instantiation
  }

  public static Phone getInstance() {
    if (instance == null) {
      instance = new Phone();
    }
    return instance;
  }

  public void click() {
    clicks++;
  }

  public int getClicks() {
    return clicks;
  }

  public void beep() {
    System.out.println("This is a phone which has been clicked " + getClicks() + " times!");
  }
}