package org.eve.factory.factorymethod;

import java.util.ArrayList;
import java.util.List;

import org.eve.factory.base.AbstractProduct;
import org.eve.factory.base.ProductEnum;

/**
 * 工厂模式-工厂方法
 * 产品工厂-根据产品类型生产产品
 *
 * @author Murphy
 * @Date 2021/07/28 15:43:00
 */
public class ProductFactory {

    private static final List<AbstractFactory> factories = new ArrayList<AbstractFactory>() {{
        add(new ProductOneFactory());
        add(new ProductTwoFactory());
    }};

    public AbstractProduct createProduct(ProductEnum type) {
        for (AbstractFactory factory : factories) {
            if (factory.getType().equals(type)) {
                return factory.createProduct();
            }
        }
        return null;
    }

    // test
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        AbstractProduct productOne = factory.createProduct(ProductEnum.PRODUCT_ONE);
        productOne.doSomething();
        AbstractProduct productTwo = factory.createProduct(ProductEnum.PRODUCT_TWO);
        productTwo.doSomething();
    }
}
