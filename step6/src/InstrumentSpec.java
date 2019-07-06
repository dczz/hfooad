import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {
    /**
     * 当你有一组特性跨对象变化时，
     * 使用集合，
     * 像map来动态存储那些特性。
     * 新特性被加入应用程序时避免改变你的代码
     */
    private Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        if (properties == null) {
            this.properties = new HashMap<>();
        } else {
            this.properties = new HashMap<>(properties);
        }
    }

    public Object getPropertie(String propertyName) {
        return properties.get(propertyName);
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (String propertyName : otherSpec.getProperties().keySet()) {
            if (!otherSpec.getPropertie(propertyName).equals(properties.get(propertyName))) {
                return false;
            }
        }
        return true;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}
