package patterns.visitor;

public class PrintVisitor implements Visitor {

  @Override
  public void visit(Camera part) {
    System.out.println("The camera has an aperture of " + part.getAperture() + "f");
  }

  @Override
  public void visit(Screen part) {
    System.out.println("The screen is " + part.getWidth() + " x " + part.getHeight());
  }

  @Override
  public void visit(Phone phone) {
    System.out.println("The most epic phone of all!");
  }

}