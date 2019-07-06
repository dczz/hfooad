import java.util.ArrayList;
import java.util.List;

public class Inventory {


    private List<Instrument> inventory = new ArrayList<>();

    void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    List<Instrument> search(InstrumentSpec searchSpec) {
        List<Instrument> result = new ArrayList<>();
        for (Instrument instrument : inventory) {
            //这个库存搜索很有意思
            if (instrument.getInstrumentSpec().matches(searchSpec)) {
                result.add(instrument);
            }
        }
        return result;
    }
}
