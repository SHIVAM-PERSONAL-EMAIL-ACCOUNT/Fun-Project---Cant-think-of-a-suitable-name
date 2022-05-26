import java.util.*;

public class IncrementCollection<Object> {

    public Object increment(Object object) {
        if (object instanceof List<?>) return incrementList(object);
        else if (object instanceof Set<?>) return incrementSet(object);
        else if (object instanceof Queue<?>) return incrementQueue(object);

        return object;
    }

    public Object incrementList(Object object) {
        List<Object> listObject = (List<Object>)object;
        List<Object> newList = getConcreteType(listObject);
        for (Object obj : listObject)
            newList.add(new IncrementObject<Object>().increment(obj));
        return (Object) newList;
    }

    public List<Object> getConcreteType(List<Object> list) {
        if (list instanceof LinkedList<Object>) return new LinkedList<>();
        else if (list instanceof ArrayList<Object>) return new ArrayList<>();
        // add more List-types

        return list;
    }

    public Object incrementSet(Object object) {
        Set<Object> setObject = (Set<Object>) object;
        Set<Object> newSet = getConcreteType(setObject);
        for (Object obj : setObject)
            newSet.add(new IncrementObject<Object>().increment(obj));
        return (Object) newSet;
    }

    public Set<Object> getConcreteType(Set<Object> set) {
        if (set instanceof HashSet<Object>) return new HashSet<>();
        else if (set instanceof TreeSet<Object>) return new TreeSet<>();
        else if (set instanceof LinkedHashSet<Object>) return new LinkedHashSet<>();
        // add more Set-types

        return set;
    }

    public Object incrementQueue(Object object) {
        Queue<Object> queueObject = (Queue<Object>) object;
        Queue<Object> newQueue = getConcreteType(queueObject);
        while (!queueObject.isEmpty())
            newQueue.add(new IncrementObject<Object>().increment(queueObject.poll()));
        return (Object) newQueue;
    }

    public Queue<Object> getConcreteType(Queue<Object> queue) {
        if (queue instanceof ArrayDeque<Object>) return new ArrayDeque<>();
        else if (queue instanceof LinkedList<Object>) return new LinkedList<>();
        else if (queue instanceof PriorityQueue<Object>) return new PriorityQueue<>();
        // add more Queue-types

        return queue;
    }
}
