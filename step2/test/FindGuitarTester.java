import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar queryGuitar = new Guitar("灰色品质吉他", 10D, Builder.无名之辈, "A", Type.A, Wood.朽木, Wood.朽木);
        List<Guitar> guitars = inventory.search(queryGuitar);
        if (!guitars.isEmpty()) {
            for (Guitar guitar : guitars) {
                System.err.println(String.format("you might like this%s %s %s %s price:%s",
                        guitar.getSerialNumber(),
                        guitar.getBuilder(),
                        guitar.getModel(),
                        guitar.getType(),
                        guitar.getPrice()));
            }
        } else {
            System.err.println("sorry,we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("灰色品质吉他", 10D, Builder.无名之辈, "A", Type.A, Wood.朽木, Wood.朽木);
        inventory.addGuitar("绿色品质吉他", 20D, Builder.能工巧匠, "B", Type.B, Wood.柳树, Wood.柳树);
        inventory.addGuitar("蓝色品质吉他", 30D, Builder.鬼斧神工, "C", Type.C, Wood.松树, Wood.松树);
        inventory.addGuitar("紫色品质吉他", 40D, Builder.无名之辈, "D", Type.D, Wood.梧桐, Wood.梧桐);
    }
}
