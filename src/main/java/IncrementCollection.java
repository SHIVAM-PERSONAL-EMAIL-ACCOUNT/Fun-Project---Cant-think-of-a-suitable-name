import java.util.*;

public class IncrementCollection<Object> {

    public Object increment(Object object) {
        if (object instanceof List<?>) return incrementList(object);
        else if (object instanceof Set<?>) return incrementSet(object);
        else if (object instanceof Queue<?>) return incrementQueue(object);

        return object;
    }

    private Object incrementList(Object object) {
        List<Object> listObject = (List<Object>)object;
        ListIterator<Object> listIterator = listObject.listIterator();
        while (listIterator.hasNext())
            listIterator.set(new IncrementObject<Object>().increment(listIterator.next()));
        return object;
    }

    private Object incrementSet(Object object) {
        Set<Object> setObject = (Set<Object>) object;
        Set<Object> newSet = new HashSet<>();
        for (Object obj : setObject)
            newSet.add(new IncrementObject<Object>().increment(obj));
        return (Object) newSet;
    }

    private Object incrementQueue(Object object) {
        Queue<Object> queueObject = (Queue<Object>) object;
        int size = queueObject.size();
        for (int i = 0; i < size; i++)
            queueObject.add(new IncrementObject<Object>().increment(queueObject.poll()));
        return (Object) queueObject;
    }
}
