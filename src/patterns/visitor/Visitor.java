package patterns.visitor;

public interface Visitor {
  public void visit(Camera part);

  public void visit(Screen part);

  public void visit(Phone phone);
}