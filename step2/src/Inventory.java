import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood back, Wood top) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, back, top);
        guitars.add(guitar);
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> searched = new ArrayList<>();
        for (Guitar guitar : guitars) {
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))) {
                continue;
            }
            if (searchGuitar.getBuilder() != guitar.getBuilder()) {
                continue;
            }
            if (searchGuitar.getType() != guitar.getType()) {
                continue;
            }
            if (searchGuitar.getBackWood() != guitar.getBackWood()) {
                continue;
            }
            if (searchGuitar.getTopWood() != guitar.getTopWood()) {
                continue;
            }
            searched.add(guitar);
            return searched;
        }
        return null;
    }
}
