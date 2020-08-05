package abstractfactory.product.entity;

import abstractfactory.product.abs.MaleHuman;

/**
 * 黄种人男性实体类
 */
public class YellowMaleHuman extends MaleHuman {
     private String color ;

    @Override
    public void say() {
        System.out.println("YellowMaleHuman say hi!~");
    }

    @Override
    public void getColor() {
        System.out.println("YellowMaleHuman getColor: "+this.color);
    }

    @Override
    public void getSex() {
        System.out.println("YellowMaleHuman getSex: "+this.sex);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
