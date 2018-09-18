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
    public void code(String name){
      Food food=new FactoryA().get();
      food=new FactoryB().get();
    }
}
