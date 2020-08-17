package patterns.iterator;

/**
 * The Iterator Method Pattern is used to abstract different types of collection
 * iteration (eg. depth-first, chronological, alphabetical, etc.).
 *
 * In the following example, two different collections of Files are collected.
 * The ForwardFileSystem iterates through its files in forward order, whilst the
 * ReverseFileSystem iterates through its files in reverse order. As this is
 * done without revealing the details of how the traversal is implemented (which
 * is useful as the traversal techniques become more complex).
 */
public class Main {
  public static void main(String args[]) {
    File apple = new File("apple");
    File banana = new File("banana");
    File coconut = new File("coconut");
    File date = new File("date");

    ForwardFileSystem forwardFileSystem = new ForwardFileSystem();
    ReverseFileSystem reverseFileSystem = new ReverseFileSystem();

    forwardFileSystem.add(apple);
    forwardFileSystem.add(banana);
    forwardFileSystem.add(coconut);

    reverseFileSystem.add(date);
    reverseFileSystem.add(banana);
    reverseFileSystem.add(coconut);

    FileIterator forwardIterator = forwardFileSystem.createIterator();
    FileIterator reverseIterator = reverseFileSystem.createIterator();

    while (forwardIterator.hasNext()) {
      System.out.println("Forward File System has [" + forwardIterator.getNext().getName() + "]");
    }

    while (reverseIterator.hasNext()) {
      System.out.println("Reverse File System has [" + reverseIterator.getNext().getName() + "]");
    }

  }
}