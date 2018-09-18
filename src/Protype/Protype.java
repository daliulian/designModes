package Protype;

/**
 * ***********************************************************
 *
 * @类名 : Protype
 * @DESCRIPTION :原型模式就是讲一个对象作为原型，使用clone()方法来创建新的实例。
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class Protype implements Cloneable{
   private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  protected Object clone()  {
   try {
     return super.clone();
   }catch (CloneNotSupportedException  e){
     e.printStackTrace();
     return null;
   }

  }

  public static void main(String[] args) {
    Protype protype1=new Protype();
    Protype protype2=(Protype)protype1.clone();
    System.out.println(protype2);
  }
}
