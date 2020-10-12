package template;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }

    @Override
    public void request() {
        super.request();
        System.out.println("RefinedAbstraction.request");
    }
}
