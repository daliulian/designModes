package AbstractFactory;

/**
 * ***********************************************************
 *
 * @类名 : FactoryA
 * @DESCRIPTION :
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class FactoryA implements Factory {

  @Override
  public Food get() {
    return new A();
  }
}
