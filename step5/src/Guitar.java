public class Guitar extends Instrument {

    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        super(serialNumber, price);
        this.guitarSpec = guitarSpec;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}
