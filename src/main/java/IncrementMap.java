import javax.management.ObjectName;
import java.util.HashMap;
import java.util.Map;

public class IncrementMap<Object> {

    private IncrementObjectInterface<Object> incrementObject;

    public IncrementMap(IncrementObject<Object> incrementObject) {
        this.incrementObject = incrementObject;
    }

    public Object increment(Object object) {
        Map<Object,Object> mapObject = (Map<Object,Object>) object;
        for (Object key : mapObject.keySet())
            mapObject.put(key, incrementMapValue(mapObject.get(key)));
        return (Object) mapObject;
    }

    private Object incrementMapValue(Object object) {
        return incrementObject.increment(object);
    }
}
