package Singleton;

/**
 * ***********************************************************
 *
 * @类名 : Singleton3
 * @DESCRIPTION :懒汉模式（线程安全）
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class Singleton3 {
     private static Singleton3 instance;
     private Singleton3(){

     }
     public static synchronized Singleton3 getInstance(){
       if(instance==null){
         instance=new Singleton3();
       }
       return instance;
     }
}
