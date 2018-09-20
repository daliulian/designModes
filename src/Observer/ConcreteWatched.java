package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ***********************************************************
 *
 * @类名 : ConcreteWatched
 * @DESCRIPTION :
 * @AUTHOR :  admin
 * @DATE :  2018.9.20
 *
 * ***********************************************************
 */
public class ConcreteWatched implements Watched {
 // 存放观察者
  private List<Watcher> list=new ArrayList<>();

  @Override
  public void addWatcher(Watcher watcher) {
    list.add(watcher);
  }

  @Override
  public void updateWatcher(Watcher watcher) {
    list.remove(watcher);
  }

  @Override
  public void notifyWatchers(String str) {
      for (Watcher watcher:list){
        watcher.update(str);
      }
  }
}
