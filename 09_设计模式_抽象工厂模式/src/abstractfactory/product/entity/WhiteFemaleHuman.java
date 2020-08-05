package abstractfactory.product.entity;

import abstractfactory.product.abs.FemaleHuman;

/**
 * 白种人女性实体类
 */
public class WhiteFemaleHuman extends FemaleHuman {
     private String color ;

    @Override
    public void say() {
        System.out.println("WhiteFemaleHuman say hi!~");
    }

    @Override
    public void getColor() {
        System.out.println("WhiteFemaleHuman getColor: "+this.color);
    }

    @Override
    public void getSex() {
        System.out.println("WhiteFemaleHuman getSex: "+this.sex);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
