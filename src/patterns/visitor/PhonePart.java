package patterns.visitor;

public interface PhonePart {
  public void accept(Visitor visitor);
}