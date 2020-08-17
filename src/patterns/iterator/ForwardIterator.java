package patterns.iterator;

import java.util.List;

public class ForwardIterator implements FileIterator {

  private FileSystem fileSystem;

  private int position;
  private List<File> cache;

  public ForwardIterator(FileSystem fileSystem) {
    this.fileSystem = fileSystem;
  }

  @Override
  public File getNext() {
    if (hasNext()) {
      position++;
      return cache.get(position - 1);
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    if (cache == null)
      cache = fileSystem.getFiles();
    return position < cache.size();
  }

}