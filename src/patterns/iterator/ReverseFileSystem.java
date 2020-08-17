package patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ReverseFileSystem implements FileSystem {
  private List<File> files = new ArrayList<File>();

  @Override
  public FileIterator createIterator() {
    return new ReverseIterator(this);
  }

  @Override
  public List<File> getFiles() {
    return files;
  }

  @Override
  public void add(File file) {
    files.add(file);
  }

  @Override
  public void remove(File file) {
    files.remove(file);
  }
}