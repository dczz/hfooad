public class MandolinSpec extends InstrumentSpec {

    private Style style;

    public MandolinSpec(Style style, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        super(model, builder, type, backWood, topWood);
        this.style = style;
    }

    @Override
    boolean matches(InstrumentSpec otherInstrumentSpec) {
        if (!super.matches(otherInstrumentSpec)) {
            return false;
        }
        if (!(otherInstrumentSpec instanceof MandolinSpec)) {
            return false;
        }
        MandolinSpec mandolinSpec = (MandolinSpec) otherInstrumentSpec;
        return mandolinSpec.getStyle() == style;
    }

    private Style getStyle() {
        return style;
    }
}
