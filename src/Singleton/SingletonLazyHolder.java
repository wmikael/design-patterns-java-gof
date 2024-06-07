package Singleton;

public class SingletonLazyHolder {
    public static final class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private static SingletonLazyHolder instance;

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
