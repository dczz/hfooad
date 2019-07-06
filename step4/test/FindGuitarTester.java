import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec searchSpec = new GuitarSpec(Builder.无名之辈, "A", Type.A, Wood.朽木, Wood.朽木, 12);
        List<Guitar> guitars = inventory.search(searchSpec);
        if (!guitars.isEmpty()) {
            for (Guitar guitar : guitars) {
                GuitarSpec guitarSpec = guitar.getGuitarSpec();
                System.err.println(String.format("you might like this%s %s %s %s price:%s numStrings：%s",
                        guitar.getSerialNumber(),
                        guitarSpec.getBuilder(),
                        guitarSpec.getModel(),
                        guitarSpec.getType(),
                        guitarSpec.getNumStrings(),
                        guitar.getPrice()));
            }
        } else {
            System.err.println("sorry,we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("灰色品质吉他", 10D, Builder.无名之辈, "A", Type.A, Wood.朽木, Wood.朽木, 12);
        inventory.addGuitar("绿色品质吉他", 20D, Builder.能工巧匠, "B", Type.B, Wood.柳树, Wood.柳树, 12);
        inventory.addGuitar("蓝色品质吉他", 30D, Builder.鬼斧神工, "C", Type.C, Wood.松树, Wood.松树, 12);
        inventory.addGuitar("紫色品质吉他", 40D, Builder.无名之辈, "D", Type.D, Wood.梧桐, Wood.梧桐, 12);
    }
}
