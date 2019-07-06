
public class GuitarSpec extends InstrumentSpec {

    private int numStrings;

    boolean matches(InstrumentSpec otherInstrumentSpec) {
        if (!super.matches(otherInstrumentSpec)) {
            return false;
        }
        if (!(otherInstrumentSpec instanceof GuitarSpec)) {
            return false;
        }
        GuitarSpec guitarSpec = (GuitarSpec) otherInstrumentSpec;
        return numStrings == guitarSpec.getNumStrings();
    }

    public GuitarSpec(Builder builder,String model,Type type,Wood back,Wood top, int numStrings) {
        super(model, builder, type, back, top);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }
}
