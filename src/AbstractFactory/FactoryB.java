package AbstractFactory;

/**
 * ***********************************************************
 *
 * @类名 : FactoryB
 * @DESCRIPTION :
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class FactoryB implements Factory {

  @Override
  public Food get() {
    return new B();
  }
}
