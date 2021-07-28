package org.eve.factory.factorymethod;

import org.eve.factory.base.AbstractProduct;
import org.eve.factory.base.ProductEnum;
import org.eve.factory.base.ProductOne;

/**
 * 具体工厂-生产产品1
 *
 * @author Murphy
 * @Date 2021/07/28 15:40:00
 */
public class ProductOneFactory extends AbstractFactory {

    @Override
    protected ProductEnum getType() {
        return ProductEnum.PRODUCT_ONE;
    }

    public AbstractProduct createProduct() {
        return new ProductOne();
    }
}
