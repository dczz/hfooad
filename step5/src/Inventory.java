import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Instrument> inventory = new ArrayList<>();

    void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    List<Instrument> search(InstrumentSpec searchSpec) {
        List<Instrument> searched = new ArrayList<>();
        for (Instrument instrument : inventory) {
            if (searchSpec.matches(instrument.getInstrumentSpec())) {
                searched.add(instrument);
            }
        }
        return searched;
    }
}
