package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Phone implements PhonePart {

  private List<PhonePart> parts = new ArrayList<PhonePart>();

  @Override
  public void accept(Visitor visitor) {
    for (PhonePart part : parts) {
      part.accept(visitor);
    }
    visitor.visit(this);
  }

  public void addPart(PhonePart part) {
    parts.add(part);
  }

}