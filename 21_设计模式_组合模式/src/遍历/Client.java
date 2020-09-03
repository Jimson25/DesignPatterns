package 遍历;

import 透明模式.Component;

public class Client {
    public static void main(String[] args) {
        Branch root = new Branch("张三", "ceo", 10000);

        Branch sub_1 = new Branch("李四", "总经理", 1000);
        Branch sub_2 = new Branch("王二麻子", "总经理", 2000);
        Branch sub_3 = new Branch("赵柳", "总经理", 3000);
        Branch sub_4 = new Branch("张麻子", "总经理", 4000);

        Leaf leaf_1 = new Leaf("张飞", "打工仔1", 1230);
        Leaf leaf_2 = new Leaf("关羽", "打工仔2", 1230);
        Leaf leaf_3 = new Leaf("赵云", "打工仔3", 1230);
        Leaf leaf_4 = new Leaf("马超", "打工仔4", 1230);
        sub_1.add(leaf_1);
        sub_1.add(leaf_2);
        sub_2.add(leaf_3);
        sub_2.add(leaf_4);

        root.add(sub_1);
        root.add(sub_2);
        root.add(sub_3);
        root.add(sub_4);

        System.out.println(root.getInfo());

        display(root);

        find(leaf_1);
    }

    /**
     * 从上往下找
     * @param root 顶级节点节点
     */
    public static void display(Corp root) {
        for (Corp corp : root.getSubNode()) {
            System.out.println(corp.getInfo());
            if (!(corp instanceof Leaf)) {
                display(corp);
            }
        }
    }

    /**
     * 从下往上找
     * @param node 底层节点
     */
    public static void find(Corp node) {
        System.out.println(node.getInfo());
        if (node.getParent() != null) {
            find(node.getParent());
        }
    }


}
