import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindGuitarTester {
    public static void main(String[] args) {
        //given:
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        //when:
        Map<String, Object> properties = new HashMap<>();
        properties.put("builder", Builder.无名之辈);
        properties.put("backWood", Wood.朽木);
        InstrumentSpec clientSpec = new InstrumentSpec(properties);
        //then:
        List<Instrument> matchingInstruments = inventory.search(clientSpec);
        //检测类型
        for (Instrument matchingInstrument : matchingInstruments) {
            InstrumentSpec spec = matchingInstrument.getInstrumentSpec();
            for (String key : spec.getProperties().keySet()) {
                if (key.equals("instrumentType")) {
                    continue;
                }
                spec.getPropertie(key);
            }
            System.err.println(spec.getPropertie("instrumentType") + " for $" + matchingInstrument.getPrice());
        }
    }

    private static void initializeInventory(Inventory inventory) {
        Map<String, Object> guitarProperties = new HashMap<>();
        guitarProperties.put("instrumentType", InstrumentType.GUITAR);
        guitarProperties.put("builder", Builder.无名之辈);
        guitarProperties.put("model", "A");
        guitarProperties.put("type", Type.A);
        guitarProperties.put("backWood", Wood.朽木);
        guitarProperties.put("topWood", Wood.朽木);
        guitarProperties.put("numStrings", 12);
        Map<String, Object> mandolinProperties = new HashMap<>();
        mandolinProperties.put("instrumentType", InstrumentType.MANDOLIN);
        mandolinProperties.put("builder", Builder.大国工匠);
        mandolinProperties.put("model", "A");
        mandolinProperties.put("type", Type.A);
        mandolinProperties.put("backWood", Wood.梧桐);
        mandolinProperties.put("topWood", Wood.梧桐);
        mandolinProperties.put("numStrings", 12);
        inventory.addInstrument("灰色品质吉他", 10D, new InstrumentSpec(guitarProperties));
        inventory.addInstrument("绿色品质吉他", 20D, new InstrumentSpec(guitarProperties));
        inventory.addInstrument("蓝色品质吉他", 30D, new InstrumentSpec(guitarProperties));
        inventory.addInstrument("紫色品质吉他", 40D, new InstrumentSpec(guitarProperties));
        inventory.addInstrument("灰色品质曼陀林", 100D, new InstrumentSpec(mandolinProperties));
        inventory.addInstrument("绿色品质曼陀林", 200D, new InstrumentSpec(mandolinProperties));
        inventory.addInstrument("蓝色品质曼陀林", 300D, new InstrumentSpec(mandolinProperties));
    }
}
