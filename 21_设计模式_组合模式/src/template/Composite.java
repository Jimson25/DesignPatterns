package template;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        this.componentList.add(component);
    }

    public void remove(Component component) {
        this.componentList.remove(component);
    }

    public List<Component> getChildren() {
        return this.componentList;
    }


}
