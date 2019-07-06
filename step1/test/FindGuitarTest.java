public class FindGuitarTest {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar queryGuitar = new Guitar("廉价吉他", 10D, "无名之辈", "A", "A", "朽木", "朽木");
        Guitar guitar = inventory.search(queryGuitar);
        if (guitar != null) {
            System.err.println(String.format("you might like this%s %s %s %s price:%s",
                    guitar.getSerialNumber(),
                    guitar.getBuilder(),
                    guitar.getModel(),
                    guitar.getType(),
                    guitar.getPrice()));
        } else {
            System.err.println("sorry,we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("廉价吉他", 10D, "无名之辈", "A", "A", "朽木", "朽木");
        inventory.addGuitar("绿色品质吉他", 20D, "能工巧匠", "B", "B", "柳树", "柳树");
        inventory.addGuitar("蓝色品质吉他", 30D, "鬼斧神工", "C", "C", "松树", "松鼠");
        inventory.addGuitar("紫色品质吉他", 40D, "大国工匠", "D", "D", "梧桐", "梧桐");
    }
}
