package abstractfactory.product.entity;

import abstractfactory.product.abs.FemaleHuman;

/**
 * 黑种人女性实体类
 */
public class BlackFemaleHuman extends FemaleHuman {
    private String color ;

    @Override
    public void say() {
        System.out.println("BlackFemaleHuman say hi!~");
    }

    @Override
    public void getColor() {
        System.out.println("BlackFemaleHuman getColor: "+this.color);
    }

    @Override
    public void getSex() {
        System.out.println("BlackFemaleHuman getSex: "+this.sex);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
