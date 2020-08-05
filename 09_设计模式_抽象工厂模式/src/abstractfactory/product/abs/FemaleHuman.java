package abstractfactory.product.abs;

/**
 * 女人抽象类
 */
public abstract class FemaleHuman implements Human{
   protected String sex ;

   public void setSex(String sex) {
      this.sex = sex;
   }
}
