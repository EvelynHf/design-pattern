package org.eve.factory.abstractfactory;

/**
 * 工厂具体类-成都农场
 *
 * @author Murphy
 * @Date 2021/07/28 17:45:00
 */
public class ChengduFarm extends AbstractFarmFactory {

    protected FarmEnum getType() {
        return FarmEnum.CHENGDU_FARM;
    }

    public Animal createAnimal() {
        return new Cattle();
    }

    public Plant createPlant() {
        return new Orange();
    }
}
