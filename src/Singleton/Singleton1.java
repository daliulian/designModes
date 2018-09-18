package Singleton;

/**
 * ***********************************************************
 *
 * @类名 : Singleton1
 * @DESCRIPTION :（一）恶汉模式
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class Singleton1 {

  private Singleton1() {

  }

  private static Singleton1 singleton1 = new Singleton1();

  public static Singleton1 getSingleton() {
    return singleton1;
  }
}
