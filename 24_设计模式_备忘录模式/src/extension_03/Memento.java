package extension_03;

import java.util.HashMap;

public class Memento {
    private HashMap<String, Object> stateMap = new HashMap<>();

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
