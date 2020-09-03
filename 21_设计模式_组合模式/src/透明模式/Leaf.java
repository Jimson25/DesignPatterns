package 透明模式;

import java.util.ArrayList;

public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        System.out.println("Leaf.doSomething" + this.name);
    }

    @Override
    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public void remove(Component component) {
        throw new UnsupportedOperationException();

    }

    @Override
    @Deprecated
    public ArrayList<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
