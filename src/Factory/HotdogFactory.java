package Factory;

/**
 * ***********************************************************
 *
 * @类名 : HotdogFactory
 * @DESCRIPTION :
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class HotdogFactory {

  private HotdogFactory() {

  }

  public static Hotdog getA() {
    return new A();
  }

  public static Hotdog getB() {
    return new B();
  }

  public static Hotdog getC() {
    return new C();
  }
}
