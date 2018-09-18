package AbstractFactory;

/**
 * ***********************************************************
 *
 * @类名 : AbstractFactory
 * @DESCRIPTION :
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class AbstractFactory {

  /**
   * 抽象工厂的灵活性就体现在这里，无需改动原有的代码，毕竟对于客户端来说，静态工厂模式在不改动StaticFactory类的代码时无法新增产品 ，如果采用了抽象工厂模式，就可以轻松的新增拓展类
   */
  public void code(String name) {
    Food food = new FactoryA().get();
    food = new FactoryB().get();
  }
}
