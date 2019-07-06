import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        InstrumentSpec instrumentSpec = new InstrumentSpec("A", Builder.无名之辈, Type.A, Wood.朽木, Wood.朽木);
        List<Instrument> instruments = inventory.search(instrumentSpec);
        if (!instruments.isEmpty()) {
            for (Instrument instrument : instruments) {
                InstrumentSpec instrumentSpec1 = instrument.getInstrumentSpec();
                System.err.println(String.format("you might like this%s %s %s %s price:%s numStrings：%s",
                        instrument.getSerialNumber(),
                        instrumentSpec1.getBuilder(),
                        instrumentSpec1.getModel(),
                        instrumentSpec1.getType(),
                        "number",
                        instrument.getPrice()));
            }
        } else {
            System.err.println("sorry,we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("灰色品质吉他", 10D, new GuitarSpec(Builder.无名之辈, "A", Type.A, Wood.朽木, Wood.朽木, 12));
        inventory.addInstrument("绿色品质吉他", 20D, new GuitarSpec(Builder.能工巧匠, "B", Type.B, Wood.柳树, Wood.柳树, 12));
        inventory.addInstrument("蓝色品质吉他", 30D, new GuitarSpec(Builder.鬼斧神工, "C", Type.C, Wood.松树, Wood.松树, 12));
        inventory.addInstrument("紫色品质吉他", 40D, new GuitarSpec(Builder.大国工匠, "D", Type.D, Wood.梧桐, Wood.梧桐, 12));
        inventory.addInstrument("灰色品质曼陀林", 100D, new MandolinSpec(Style.A, Builder.无名之辈, "A", Type.A, Wood.朽木, Wood.朽木));
        inventory.addInstrument("绿色品质曼陀林", 200D, new MandolinSpec(Style.F, Builder.大国工匠, "B", Type.B, Wood.梧桐, Wood.梧桐));
        inventory.addInstrument("蓝色品质曼陀林", 300D, new MandolinSpec(Style.F, Builder.大国工匠, "C", Type.C, Wood.梧桐, Wood.梧桐));
    }
}
