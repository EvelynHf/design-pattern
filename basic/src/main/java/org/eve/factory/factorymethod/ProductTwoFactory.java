package org.eve.factory.factorymethod;

import org.eve.factory.base.AbstractProduct;
import org.eve.factory.base.ProductEnum;
import org.eve.factory.base.ProductTwo;

/**
 * 具体工厂-生产产品2
 *
 * @author Murphy
 * @Date 2021/07/28 15:41:00
 */
public class ProductTwoFactory extends AbstractFactory {

    @Override
    protected ProductEnum getType() {
        return ProductEnum.PRODUCT_TWO;
    }

    public AbstractProduct createProduct() {
        return new ProductTwo();
    }
}
