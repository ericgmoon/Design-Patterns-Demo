package patterns.factorymethod;

public class PhoneFactory extends ElectronicFactory {
  @Override
  protected Electronic create() {
    return new Phone(200);
  }
}