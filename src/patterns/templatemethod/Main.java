package patterns.templatemethod;

/**
 * The Template Pattern is used to define the skeleton of an algorithm in the
 * superclass but lets subclasses override specific steps of the algorithm
 * without changing its structure.
 * 
 * This minimise redundant code.
 *
 * In the following example, two apps, YouTube and Google are opened and closed,
 * with each app overriding only specific steps of the app open-close process.
 */
public class Main {
  public static void main(String args[]) {
    GoogleApp google = new GoogleApp();
    YouTubeApp youtube = new YouTubeApp();

    google.run();
    youtube.run();
  }
}