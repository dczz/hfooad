public class Mandolin extends Instrument {

    private MandolinSpec mandolinSpec;

    public Mandolin(String serialNumber, double price, MandolinSpec mandolinSpec) {
        super(serialNumber, price);
        this.mandolinSpec = mandolinSpec;
    }

    public MandolinSpec getMandolinSpec() {
        return mandolinSpec;
    }
}
