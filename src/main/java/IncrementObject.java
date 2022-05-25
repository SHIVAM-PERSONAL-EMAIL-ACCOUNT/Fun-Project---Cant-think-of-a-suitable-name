import java.util.*;

public class IncrementObject<Object> {

    public Object increment(Object object) {
        if (object instanceof Number) return new IncrementNumber<Object>().increment(object);
        else if (object instanceof Map<?,?>) return new IncrementMap<Object>().increment(object);
        else if (object instanceof Collection<?>) return new IncrementCollection<Object>().increment(object);

        return object;
    }
}
