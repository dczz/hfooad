import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood back, Wood top, int numStrings) {
        Guitar guitar = new Guitar(serialNumber, price, new GuitarSpec(builder, model, type, back, top, numStrings));
        guitars.add(guitar);
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> searched = new ArrayList<>();
        for (Guitar guitar : guitars) {
            if (searchSpec.matcher(guitar.getGuitarSpec())) {
                searched.add(guitar);
            }
        }
        return searched;
    }
}
