package buildermode.director;

import buildermode.builder.BenzBuilder;
import buildermode.builder.BmwBuilder;
import buildermode.model.BenzModel;
import buildermode.model.BmwModel;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BmwBuilder bmwBuilder = new BmwBuilder();

    public BenzModel getBenzAModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("engineBoom");
        this.sequence.add("stop");
        return benzBuilder.build(this.sequence);
    }

    public BenzModel getBenzBModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("engineBoom");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        this.sequence.add("alarm");
        return benzBuilder.build(this.sequence);
    }

    public BmwModel getBmwAModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("engineBoom");
        this.sequence.add("stop");
        return bmwBuilder.build(this.sequence);
    }

    public BmwModel getBmwBModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("engineBoom");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        this.sequence.add("alarm");
        return bmwBuilder.build(this.sequence);
    }
}
