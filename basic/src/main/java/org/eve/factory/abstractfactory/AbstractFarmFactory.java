package org.eve.factory.abstractfactory;

/**
 * 抽象工厂-农场
 *
 * @author Murphy
 * @Date 2021/07/28 17:32:00
 */
public abstract class AbstractFarmFactory {

    protected abstract FarmEnum getType();

    public abstract Animal createAnimal();

    public abstract Plant createPlant();
}
