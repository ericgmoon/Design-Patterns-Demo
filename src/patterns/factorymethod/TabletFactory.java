package patterns.factorymethod;

public class TabletFactory extends ElectronicFactory {
  @Override
  protected Electronic create() {
    return new Tablet(400);
  }
}