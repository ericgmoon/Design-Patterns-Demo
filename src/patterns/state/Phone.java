package patterns.state;

public class Phone {
  private PhoneState state = new OnState(this);

  public void setState(PhoneState state) {
    this.state = state;
  }

  public void ring() {
    state.beep();
  }

  public void holdPowerButton() {
    state.holdPowerButton();
  }
}