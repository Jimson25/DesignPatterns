import model.AbstractModel;
import model.EntityModelOne;
import model.EntityModelTwo;

/**
 *  模板方法模式: 定义一个操作中的算法的框架,而将一些步骤延迟到子类中.使得子类在可以不改变算法的结构即可冲定义该算法的某些步骤
 *
 *  在这个例子中,我们在算法吗,模板`AbstractModel`中定义了两个基本方法及一个模板方法,在模板方法中确定了该算法的执行流程,然后在子类中让其自由实现具体的算法步骤
 *  这里我们将末班类中的模板方法设置为final避免子类重写该方法.
 */
public class Client {
    public static void main(String[] args) {
        AbstractModel model = new EntityModelOne();
        model.templateMethod();

        model = new EntityModelTwo();
        model.templateMethod();

    }
}
