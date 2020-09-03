package 遍历;

import java.util.ArrayList;

public class Branch extends Corp {
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    private ArrayList<Corp> corpList = new ArrayList();

    public void add(Corp component) {
        component.setParent(this);
        this.corpList.add(component);
    }

    public ArrayList<Corp> getSubNode() {
        return this.corpList;
    }


}
