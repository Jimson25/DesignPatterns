package buildermode.model;

import java.util.ArrayList;

public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected abstract void stop();

    public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String s = this.sequence.get(i);
            switch (s) {
                case "start":
                    this.start();
                    break;
                case "alarm":
                    this.alarm();
                    break;
                case "engineBoom":
                    this.engineBoom();
                    break;
                case "stop":
                    this.stop();
                    break;
            }
        }
    }

    public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
