package patterns.visitor;

/**
 * The Visitor Pattern is used to write algorithm for an object in a separate
 * class.
 * 
 * The benefit of this technique is that existing code need not be altered (as
 * long as it's set up such that it accepts visitors) to add a new
 * functionality.
 *
 * In the following example, a phone, camera, and screen are created. Rather
 * than adding the ability to print details about each component to existing
 * classes (and risk breaking it), this functionality is implemented using the
 * PrintVisitor.
 */
public class Main {
  public static void main(String args[]) {
    Phone phone = new Phone();
    Camera camera = new Camera(3.7);
    Screen screen = new Screen(300, 500);

    phone.addPart(camera);

    camera.accept(new PrintVisitor());
    phone.accept(new PrintVisitor());

    phone.addPart(screen);

    phone.accept(new PrintVisitor());
  }
}