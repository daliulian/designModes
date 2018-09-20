package Observer;

/**
 * ***********************************************************
 *
 * @类名 : Test
 * @DESCRIPTION :观察者模式测试类
 * @AUTHOR :  admin
 * @DATE :  2018.9.20
 *
 * ***********************************************************
 */
public class Test {

  /**
   * 参考博客
   * http://www.cnblogs.com/mengdd/archive/2013/02/07/2908929.html
   * @param args
   */
  public static void main(String[] args) {
    Watched girl=new ConcreteWatched();

    Watcher watcher1=new ConcreteWatcher();
    Watcher watcher2=new ConcreteWatcher();
    Watcher watcher3=new ConcreteWatcher();

    girl.addWatcher(watcher1);
    girl.addWatcher(watcher2);
    girl.addWatcher(watcher3);

    girl.notifyWatchers("通知观察者调用啦");

    girl.updateWatcher(watcher1);

    girl.notifyWatchers("再次调用了");

  }
}
