package patterns.state;

public class OffState implements PhoneState {

  private Phone phone;

  public OffState(Phone phone) {
    this.phone = phone;
  }

  @Override
  public void beep() {
    System.out.println("Can't beep because it's off :(");
  }

  @Override
  public void holdPowerButton() {
    phone.setState(new OnState(phone));
  }

}