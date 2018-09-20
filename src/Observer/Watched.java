package Observer;

/**
 * ***********************************************************
 *
 * @类名 : Watched
 * @DESCRIPTION :抽象主题角色：被观察者
 * @AUTHOR :  admin
 * @DATE :  2018.9.20
 *
 * ***********************************************************
 */
public interface Watched {
    public void addWatcher(Watcher watcher);
    public void updateWatcher(Watcher watcher);
    public void notifyWatchers(String str);
}
