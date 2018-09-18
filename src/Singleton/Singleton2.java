package Singleton;

/**
 * ***********************************************************
 *
 * @类名 : Singleton2
 * @DESCRIPTION :懒汉模式（线程不安全）
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class Singleton2 {

  private Singleton2() {

  }

  private static Singleton2 instance;

  public static Singleton2 getInstance() {
    if (instance == null) {
      instance = new Singleton2();
    }
    return instance;
  }
}
