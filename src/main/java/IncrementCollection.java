import java.util.*;

public class IncrementCollection<Object> {

    private IncrementObjectInterface<Object> incrementObject;

    public IncrementCollection(IncrementObject<Object> incrementObject) {
        this.incrementObject = incrementObject;
    }

    public Object increment(Object object) {
        if (object instanceof List<?>) return incrementList(object);
        else if (object instanceof Set<?>) return incrementSet(object);
        else if (object instanceof Queue<?>) return incrementQueue(object);

        return object;
    }

    private Object incrementList(Object object) {
        List<Object> listObject = (List<Object>)object;
        List<Object> newList = getConcreteType(listObject);
        for (Object obj : listObject)
            newList.add(incrementObject.increment(obj));
        return (Object) newList;
    }

    private List<Object> getConcreteType(List<Object> list) {
        if (list instanceof LinkedList<Object>) return new LinkedList<>();
        else if (list instanceof ArrayList<Object>) return new ArrayList<>();
        // add more List-types

        return new ArrayList<>();
    }

    private Object incrementSet(Object object) {
        Set<Object> setObject = (Set<Object>) object;
        Set<Object> newSet = getConcreteType(setObject);
        for (Object obj : setObject)
            newSet.add(incrementObject.increment(obj));
        return (Object) newSet;
    }

    private Set<Object> getConcreteType(Set<Object> set) {
        if (set instanceof HashSet<Object>) return new HashSet<>();
        else if (set instanceof TreeSet<Object>) return new TreeSet<>();
        else if (set instanceof LinkedHashSet<Object>) return new LinkedHashSet<>();
        // add more Set-types

        return new HashSet<>();
    }

    private Object incrementQueue(Object object) {
        Queue<Object> queueObject = (Queue<Object>) object;
        Queue<Object> newQueue = getConcreteType(queueObject);
        while (!queueObject.isEmpty())
            newQueue.add(incrementObject.increment(queueObject.poll()));
        return (Object) newQueue;
    }

    private Queue<Object> getConcreteType(Queue<Object> queue) {
        if (queue instanceof ArrayDeque<Object>) return new ArrayDeque<>();
        else if (queue instanceof LinkedList<Object>) return new LinkedList<>();
        else if (queue instanceof PriorityQueue<Object>) return new PriorityQueue<>();
        // add more Queue-types

        return new ArrayDeque<>();
    }
}
