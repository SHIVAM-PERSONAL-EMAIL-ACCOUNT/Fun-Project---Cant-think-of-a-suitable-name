import java.util.*;

public class IncrementObject<Object> implements IncrementObjectInterface<Object> {

    private IncrementNumber<Object> incrementNumber;
    private IncrementCollection<Object> incrementCollection;
    private IncrementMap<Object> incrementMap;

    public IncrementObject() {
        incrementNumber = new IncrementNumber<>();
        incrementCollection = new IncrementCollection<>(this);
        incrementMap = new IncrementMap<>(this);
    }

    @Override
    public Object increment(Object object) {
        if (object instanceof Number) return incrementNumber.increment(object);
        else if (object instanceof Map<?,?>) return incrementMap.increment(object);
        else if (object instanceof Collection<?>) return incrementCollection.increment(object);

        return object;
    }
}
