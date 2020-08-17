package patterns.state;

/**
 * The State Pattern is used to abstract different (conditional) behaviour for
 * an object modelling a finite-state machine.
 * 
 * Rather than implementing the behaviour for each state in one class, this is
 * abstracted into different states.
 * 
 * Whilst this is very similar to the Strategy Pattern, it differs in that
 * states are able to back-reference the finite-state machine object and that
 * they can have knowledge of / call each other. In the Strategy Pattern, each
 * strategy is completely independent of each other.
 *
 * In the following example, the Phone rings, turns off, rings again (or
 * attempts to), turns on, then rings again. Whether the phone rings or not is
 * dependent on its on/off state.
 */
public class Main {
  public static void main(String args[]) {
    Phone phone = new Phone();

    phone.ring();
    phone.holdPowerButton();
    phone.ring();
    phone.holdPowerButton();
    phone.ring();
  }
}