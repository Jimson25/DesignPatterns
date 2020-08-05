package abstractfactory.product.entity;

import abstractfactory.product.abs.FemaleHuman;

/**
 * 黄种人女性实体类
 */
public class YellowFemaleHuman extends FemaleHuman {
     private String color ;

    @Override
    public void say() {
        System.out.println("YellowFemaleHuman say hi!~");
    }

    @Override
    public void getColor() {
        System.out.println("YellowFemaleHuman getColor: "+this.color);
    }

    @Override
    public void getSex() {
        System.out.println("YellowFemaleHuman getSex: "+this.sex);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
