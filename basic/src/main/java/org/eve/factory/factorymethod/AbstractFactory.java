package org.eve.factory.factorymethod;

import org.eve.factory.base.AbstractProduct;
import org.eve.factory.base.ProductEnum;

/**
 * 抽象工厂
 *
 * @author Murphy
 * @Date 2021/07/28 15:27:00
 */
public abstract class AbstractFactory {

    protected abstract ProductEnum getType();

    public abstract AbstractProduct createProduct();

}

