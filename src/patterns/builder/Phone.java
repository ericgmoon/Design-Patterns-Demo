package patterns.builder;

public class Phone {
  private int width;
  private int height;
  private boolean isOLED = false;
  private boolean isThin = false;

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setIsOLED(boolean isOLED) {
    this.isOLED = isOLED;
  }

  public void setIsThin(boolean isThin) {
    this.isThin = isThin;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public void beep() {
    System.out
        .println("This is a " + (isThin ? "thin" : "thick") + " phone " + (isOLED ? "with" : "without") + " OLED!");
  }
}