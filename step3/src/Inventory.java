import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood back, Wood top) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, back, top);
        guitars.add(guitar);
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> searched = new ArrayList<>();
        for (Guitar guitar : guitars) {
            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            String model = searchSpec.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel()))) {
                continue;
            }
            if (searchSpec.getType() != guitarSpec.getType()) {
                continue;
            }
            if (searchSpec.getBackWood() != guitarSpec.getBackWood()) {
                continue;
            }
            if (searchSpec.getTopWood() != guitarSpec.getTopWood()) {
                continue;
            }
            searched.add(guitar);
            return searched;
        }
        return null;
    }
}
