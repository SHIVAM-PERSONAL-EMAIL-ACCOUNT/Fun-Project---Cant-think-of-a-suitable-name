import javax.management.ObjectName;
import java.util.HashMap;
import java.util.Map;

public class IncrementMap<Object> {

    public Object increment(Object object) {
        Map<Object,Object> mapObject = (Map<Object,Object>) object;
        for (Object key : mapObject.keySet())
            mapObject.put(key, incrementMapValue(mapObject.get(key)));
        return (Object) mapObject;
    }

    private Object incrementMapValue(Object object) {
        return new IncrementObject<Object>().increment(object);
    }
}
