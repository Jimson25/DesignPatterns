package buildermode.builder;

import buildermode.model.BmwModel;

import java.util.ArrayList;

public class BmwBuilder extends CarBuilder {
    @Override
    public BmwModel build(ArrayList sequence) {
        BmwModel bmwModel = new BmwModel();
        bmwModel.setSequence(sequence);
        return bmwModel;
    }
}
