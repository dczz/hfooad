
public class GuitarSpec {

    private Builder builder;

    private String model;

    private Type type;

    private Wood backWood;

    private int numStrings;

    private Wood topWood;

    boolean matcher(GuitarSpec guitarSpec) {
        if (guitarSpec.getTopWood() != this.topWood) {
            return false;
        }
        if (guitarSpec.getBackWood() != this.backWood) {
            return false;
        }
        if (guitarSpec.getType() != this.type) {
            return false;
        }
        if (guitarSpec.getBuilder() != this.builder) {
            return false;
        }
        if (guitarSpec.getNumStrings() != this.numStrings) {
            return false;
        }
        return (guitarSpec.getModel() != null) && (!guitarSpec.getModel().equals("")) && guitarSpec.getModel().equals(this.model);
    }

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }
}
