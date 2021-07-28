package org.eve.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 工厂模式-抽象工厂
 * 农场工厂-根据农场类型生产农场动物和植物
 *
 * @author Murphy
 * @Date 2021/07/28 17:46:00
 */
public class FarmFactory {

    private static final List<AbstractFarmFactory> factories = new ArrayList<AbstractFarmFactory>() {{
        add(new BeijingFarm());
        add(new ChengduFarm());
    }};

    public AbstractFarmFactory createFarm(FarmEnum type) {
        for (AbstractFarmFactory farmFactory : factories) {
            if (type.equals(farmFactory.getType())) {
                return farmFactory;
            }
        }
        return null;
    }

    // test
    public static void main(String[] args) {
        FarmFactory farmFactory = new FarmFactory();
        AbstractFarmFactory beijingFarm = farmFactory.createFarm(FarmEnum.BEIJING_FARM);
        beijingFarm.createAnimal().animalDoSomething();
        beijingFarm.createPlant().plantDoSomething();

        AbstractFarmFactory chengduFarm = farmFactory.createFarm(FarmEnum.CHENGDU_FARM);
        chengduFarm.createAnimal().animalDoSomething();
        chengduFarm.createPlant().plantDoSomething();
    }
}
