package patterns.state;

public class OnState implements PhoneState {

  private Phone phone;

  public OnState(Phone phone) {
    this.phone = phone;
  }

  @Override
  public void beep() {
    System.out.println("Beeping as a phone should!");
  }

  @Override
  public void holdPowerButton() {
    phone.setState(new OffState(phone));
  }

}