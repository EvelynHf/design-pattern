package org.eve.singleton;

/**
 * 单例-懒汉模式，线程安全
 * instance = new SingletonLazySafe()，是两步操作：对象初始化、变量赋值
 * 在JVM中可能由于指令优化，将这两步操作顺序颠倒，比如先分配内存空间并赋值给变量，然后再去初始化这个对象
 * 因此，使用 synchronized 对代码库加锁并不能绝对保证线程安全
 * 有可能A线程进入synchronized块，执行完分配内存空间并赋值给变量，但是对象还未初始化的时候，A线程退出了，
 * 此时如果B线程调用 getInstance()，会取得变量，在具体使用的时候，会报错对象未初始化
 * <p>
 * volatile 能够防止指令重排序，并且保证内存可见（通过volatile修饰的变量，不会被线程本地缓存，所有线程对该对象的读写都会第一时间同步到主内存）
 *
 * @author Murphy
 * @Date 2021/07/27 16:24:00
 */
public class SingletonLazySafe {

    private volatile static SingletonLazySafe instance;

    private SingletonLazySafe() {
    }

    //    public static synchronized SingletonLazySafe getInstance() {
    //        if (null == instance) {
    //            instance = new SingletonLazySafe();
    //        }
    //        return instance;
    //    }

    public static SingletonLazySafe getInstance() {
        if (null == instance) {
            synchronized (SingletonLazySafe.class) {
                if (null == instance) {
                    instance = new SingletonLazySafe();
                }
            }
        }
        return instance;
    }

}
