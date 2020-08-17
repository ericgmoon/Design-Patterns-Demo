package patterns.iterator;

public interface FileIterator {
  public File getNext();

  public boolean hasNext();
}