package 透明模式;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public ArrayList<Component> getChildren() {
        return this.componentList;
    }
}
