package buildermode.builder;

import buildermode.model.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {
    public abstract CarModel build(ArrayList sequence);
}
