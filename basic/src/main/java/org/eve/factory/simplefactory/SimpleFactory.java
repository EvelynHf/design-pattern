package org.eve.factory.simplefactory;

import org.eve.factory.base.AbstractProduct;
import org.eve.factory.base.ProductEnum;
import org.eve.factory.base.ProductOne;
import org.eve.factory.base.ProductTwo;

/**
 * 工厂模式-简单工厂
 *
 * @author Murphy
 * @Date 2021/07/28 15:00:00
 */
public class SimpleFactory {

    public static AbstractProduct createProduct(ProductEnum type) {
        if (ProductEnum.PRODUCT_ONE.equals(type)) {
            return new ProductOne();
        } else if (ProductEnum.PRODUCT_TWO.equals(type)) {
            return new ProductTwo();
        } else {
            return null;
        }
    }

    // test
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        AbstractProduct productOne = factory.createProduct(ProductEnum.PRODUCT_ONE);
        productOne.doSomething();
        AbstractProduct productTwo = factory.createProduct(ProductEnum.PRODUCT_TWO);
        productTwo.doSomething();
    }
}
