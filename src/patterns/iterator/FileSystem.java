package patterns.iterator;

import java.util.List;

public interface FileSystem {
  public FileIterator createIterator();

  public List<File> getFiles();

  public void add(File file);

  public void remove(File file);
}