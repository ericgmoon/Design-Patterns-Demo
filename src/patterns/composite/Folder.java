package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Executable {

  List<Executable> children = new ArrayList<Executable>();

  public void add(Executable child) {
    children.add(child);
  }

  public void remove(Executable child) {
    children.remove(child);
  }

  public List<Executable> getChildren() {
    return children;
  }

  @Override
  public void execute() {
    for (Executable exe : children) {
      exe.execute();
    }
  }

}