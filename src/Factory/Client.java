package Factory;

/**
 * ***********************************************************
 *
 * @类名 : Client
 * @DESCRIPTION :
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class Client {

  public Hotdog getHotDog(String name) {
    Hotdog hotdog = null;
    if ("A".equals(name)) {
      hotdog = HotdogFactory.getA();
    } else if ("B".equals(name)) {
      hotdog = HotdogFactory.getB();
    } else if ("C".equals(name)) {
      hotdog = HotdogFactory.getC();
    }
    return hotdog;
  }
}
