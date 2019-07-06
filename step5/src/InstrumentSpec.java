public class InstrumentSpec {

    private String model;

    private Builder builder;

    private Type type;

    private Wood backWood;

    private Wood topWood;

    boolean matches(InstrumentSpec otherInstrumentSpec) {
        if (builder != otherInstrumentSpec.getBuilder()) {
            return false;
        }
        if (type != otherInstrumentSpec.getType()) {
            return false;
        }
        if (backWood != otherInstrumentSpec.getBackWood()) {
            return false;
        }
        if (topWood != otherInstrumentSpec.getTopWood()) {
            return false;
        }
        return (model == null) || (model.equals("")) || (model.equals(otherInstrumentSpec.getModel()));
    }

    public InstrumentSpec(String model, Builder builder, Type type, Wood backWood, Wood topWood) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    String getModel() {
        return model;
    }

    Builder getBuilder() {
        return builder;
    }

    Type getType() {
        return type;
    }

    Wood getBackWood() {
        return backWood;
    }

    Wood getTopWood() {
        return topWood;
    }
}
