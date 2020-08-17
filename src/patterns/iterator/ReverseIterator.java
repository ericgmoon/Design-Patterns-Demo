package patterns.iterator;

import java.util.List;

public class ReverseIterator implements FileIterator {
  private FileSystem fileSystem;

  private int position;
  private List<File> cache;

  public ReverseIterator(FileSystem fileSystem) {
    this.fileSystem = fileSystem;
  }

  @Override
  public File getNext() {
    if (hasNext()) {
      position++;
      return cache.get(cache.size() - position);
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