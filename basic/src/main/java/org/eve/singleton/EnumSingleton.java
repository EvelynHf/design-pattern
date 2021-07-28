package org.eve.singleton;

/**
 * 单例-枚举方式
 * Joshua Bloch大神说过这句话：“单元素的枚举类型已经成为实现Singleton的最佳方法”
 * 破坏单例模式的方法及解决办法
 * ① 除枚举方式外, 其他方法都会通过反射的方式破坏单例,反射是通过调用构造方法生成新的对象，所以如果我们想要阻止单例破坏，
 * 可以在构造方法中进行判断，若已有实例, 则阻止生成新的实例。
 * ② 如果单例类实现了序列化接口Serializable, 就可以通过反序列化破坏单例，所以我们可以不实现序列化接口,如果非得实现序列化接口，
 * 可以重写反序列化方法readResolve(), 反序列化时直接返回相关单例对象。
 *
 * @author Murphy
 * @Date 2021/07/27 19:16:00
 */
public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
    }
}
