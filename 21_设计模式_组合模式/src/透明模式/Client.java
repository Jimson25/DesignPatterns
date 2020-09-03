package 透明模式;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();

        Composite composite_1 = new Composite();
        Composite composite_2 = new Composite();
        root.add(composite_1);
        root.add(composite_2);

        Composite composite_1_1 = new Composite();
        Composite composite_1_2 = new Composite();
        composite_1.add(composite_1_1);
        composite_1.add(composite_1_2);

        Leaf leaf_1 = new Leaf("leaf_1");
        Leaf leaf_2 = new Leaf("leaf_2");
        Leaf leaf_3 = new Leaf("leaf_3");
        Leaf leaf_4 = new Leaf("leaf_4");
        composite_1_1.add(leaf_1);
        composite_1_1.add(leaf_2);
        composite_1_1.add(leaf_3);
        composite_1_1.add(leaf_4);

        display(root);


    }

    //通过递归遍历树
    public static void display(Component root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) { //叶子节点
                c.doSomething();
            } else { //树枝节点
                display(c);
            }
        }
    }
}
