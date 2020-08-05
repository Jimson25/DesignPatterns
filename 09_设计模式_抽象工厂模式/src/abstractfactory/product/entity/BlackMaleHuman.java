package abstractfactory.product.entity;

import abstractfactory.product.abs.MaleHuman;

/**
 * 黑种人男性实体类
 */
public class BlackMaleHuman extends MaleHuman {
     private  String color ;

    @Override
    public void say() {
        System.out.println("BlackMaleHuman say hi!~");
    }

    @Override
    public void getColor() {
        System.out.println("BlackMaleHuman getColor: "+this.color);
    }

    @Override
    public void getSex() {
        System.out.println("BlackMaleHuman getSex: "+this.sex);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
