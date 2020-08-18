package patterns.composite;

/**
 * The Composite Pattern is used to simulate a tree structure and work with them
 * as if they were individual objects.
 *
 * In the following example, a list of apps are organised into folders. Apps
 * (nodes) can be executed individually, whilst folders (branching nodes), when
 * executed, executes all apps directly and indirectly within it.
 */
public class Main {
  public static void main(String args[]) {
    App google = new App("Google");
    App youtube = new App("YouTube");
    App facebook = new App("Facebook");
    App instagram = new App("Instagram");
    App twitter = new App("Twitter");

    Folder gsuite = new Folder();
    Folder socialmedia = new Folder();
    Folder bymark = new Folder();

    gsuite.add(google);
    gsuite.add(youtube);

    google.execute();
    gsuite.execute();

    bymark.add(facebook);
    bymark.add(instagram);
    socialmedia.add(bymark);
    socialmedia.add(twitter);

    socialmedia.execute();
  }
}