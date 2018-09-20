package Observer;

/**
 * ***********************************************************
 *
 * @类名 : ConcreteWatcher
 * @DESCRIPTION :
 * @AUTHOR :  admin
 * @DATE :  2018.9.20
 *
 * ***********************************************************
 */
public class ConcreteWatcher implements Watcher {

  @Override
  public void update(String str) {
    System.out.println(str);
  }
}
