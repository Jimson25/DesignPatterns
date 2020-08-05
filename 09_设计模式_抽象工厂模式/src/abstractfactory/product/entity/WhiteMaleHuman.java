package abstractfactory.product.entity;

import abstractfactory.product.abs.MaleHuman;

public class WhiteMaleHuman extends MaleHuman {
     private String color ;

    @Override
    public void say() {
        System.out.println("WhiteMaleHuman say hi!~");
    }

    @Override
    public void getColor() {
        System.out.println("WhiteMaleHuman getColor: "+this.color);
    }

    @Override
    public void getSex() {
        System.out.println("WhiteMaleHuman getSex: "+this.sex);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
