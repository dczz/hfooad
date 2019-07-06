public class Instrument {

    private String serialNumber;

    private double price;

    private InstrumentSpec instrumentSpec;

    Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
    }

    String getSerialNumber() {
        return serialNumber;
    }

    double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Instrument(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }
}
