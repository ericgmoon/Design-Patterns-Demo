package patterns.templatemethod;

public class GoogleApp extends App {

  @Override
  public void welcome() {
    System.out.println("Welcome to Google!");
  }

  @Override
  public void printMessage() {
    System.out.println("Google doodle!");
  }

}