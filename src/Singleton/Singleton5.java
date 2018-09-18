package Singleton;

/**
 * ***********************************************************
 *
 * @类名 : Singleton5
 * @DESCRIPTION : 静态内部类单例模式
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class Singleton5 {

  private Singleton5() {

  }

  public static Singleton5 getInstance() {
    return SingletonHolder.instance;
  }

  /**
   * 第一次加载Singleton类时并不会初始化sInstance，只有第一次调用getInstance方法时虚拟机加载SingletonHolder 并初始化sInstance
   * ，这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
   */
  private static class SingletonHolder {

    private static final Singleton5 instance = new Singleton5();
  }
}
