package org.eve.factory.abstractfactory;

/**
 * 工厂具体类-北京农场
 *
 * @author Murphy
 * @Date 2021/07/28 17:43:00
 */
public class BeijingFarm extends AbstractFarmFactory {

    protected FarmEnum getType() {
        return FarmEnum.BEIJING_FARM;
    }

    public Animal createAnimal() {
        return new Horse();
    }

    public Plant createPlant() {
        return new Apple();
    }
}
