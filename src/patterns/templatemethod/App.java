package patterns.templatemethod;

public abstract class App {
  public void run() {
    open();
    welcome();
    printMessage();
    close();
  }

  public void open() {
    System.out.println("Opening app...");
  }

  public void welcome() {
    System.out.println("Welcome to the app!");
  }

  public abstract void printMessage();

  public void close() {
    System.out.println("Closing app...");
  }
}