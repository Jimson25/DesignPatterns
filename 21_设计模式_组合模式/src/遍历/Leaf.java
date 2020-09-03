package 遍历;

import java.util.ArrayList;

public class Leaf extends Corp{
    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }

    @Override
    @Deprecated
    public ArrayList<Corp> getSubNode() {
        throw new UnsupportedOperationException();
    }


}
