package Singleton;

/**
 * ***********************************************************
 *
 * @类名 : Singleton4
 * @DESCRIPTION : 双重检查模式 （DCL）
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class Singleton4 {

  /**
   * volatile字段值在 所有的线程 和 CPU缓存中必须保持同步。（参考Java内存模型）
   *
   * 简单讲，你读取的volatile字段必然是上次写入的，而无关乎那个线程写入的。
   */
  private volatile static Singleton4 instance;

  private Singleton4() {
  }

  public static Singleton4 getInstance() {
    if (instance == null) {
      synchronized (Singleton4.class) {
        if (instance == null) {
          instance = new Singleton4();
        }
      }
    }
    return instance;
  }
}
