package patterns.composite;

public class App implements Executable {

  private String name;

  public App(String name) {
    this.name = name;
  }

  @Override
  public void execute() {
    System.out.println(name + " executed!");
  }

}