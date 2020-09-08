package template;

import template.subsystem.ClassA;
import template.subsystem.ClassB;
import template.subsystem.ClassC;

/**
 * 门面角色
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    public void doMethodA() {
        this.a.methodA();
    }

    public void doMethodB() {
        this.b.methodB();
    }

    public void doMethodC() {
        this.c.methodC();
    }

}
