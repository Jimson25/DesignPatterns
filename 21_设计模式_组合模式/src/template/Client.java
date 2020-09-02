package template;

public class Client {
    public static void main(String[] args) {
        Composite composite = new Composite();

        Composite children = new Composite();
        composite.add(children);

        Leaf leaf_1 = new Leaf();
        Leaf leaf_2 = new Leaf();
        Leaf leaf_3 = new Leaf();
        Leaf leaf_4 = new Leaf();
        children.add(leaf_1);
        children.add(leaf_2);
        children.add(leaf_3);
        children.add(leaf_4);

        display(composite);
    }

    public static void display(Composite root) {
        for (Component component : root.getChildren()) {
            if (component instanceof Leaf) {
                component.doSomething();
            } else {
                display((Composite) component);
            }
        }


    }


}
