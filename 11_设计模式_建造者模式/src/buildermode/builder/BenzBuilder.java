package buildermode.builder;

import buildermode.model.BenzModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    @Override
    public BenzModel build(ArrayList sequence) {
        BenzModel benzModel = new BenzModel();
        benzModel.setSequence(sequence);
        return benzModel;
    }
}
