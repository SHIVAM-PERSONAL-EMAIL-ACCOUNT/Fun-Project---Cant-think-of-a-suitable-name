import java.util.*;

public class Test {

    public static void main(String args []) {
        IncrementObject<Object> incrementObject = new IncrementObject<>();
        Object res = null;

        // Example-1
        Object object1 = new Integer(1);
        res = incrementObject.increment(object1);
        System.out.println(res.toString());
        System.out.println();

        // Example-2
        Object object2 = new Double(1);
        res = incrementObject.increment(object2);
        System.out.println(res.toString());
        System.out.println();

        // Example-3
        Object object3 = new String("hello");
        res = incrementObject.increment(object3);
        System.out.println(res.toString());
        System.out.println();

        // Example-4
        List object4 = Arrays.asList(
                new String("hello"),
                new Integer(1),
                new Double(1));
        res = incrementObject.increment(object4);
        System.out.println(res.toString());
        System.out.println();

        // Example-5
        Map object5 = new HashMap();
        object5.put("k1", new Double(1));
        object5.put("k2", new Integer(1));
        object5.put("k3", new String("hello"));
        object5.put("k3", Arrays.asList(
                new String("hello"),
                new Integer(1),
                new Double(1),
                Arrays.asList(
                        new String("hello"),
                        new Integer(1),
                        new Double(1))));
        res = incrementObject.increment(object5);
        System.out.println(res.toString());
        System.out.println();

        // Example-6
        List object6 = new LinkedList<>();
        object6.add(new Integer(1));
        object6.add(new Double(1));
        object6.add(new String("hello"));
        Map mapForObject6 = new HashMap();
        mapForObject6.put("k1", new Double(1));
        mapForObject6.put("k2", new Integer(1));
        mapForObject6.put("k3", new String("hello"));
        mapForObject6.put("k3", Arrays.asList(
                new String("hello"),
                new Integer(1),
                new Double(1),
                Arrays.asList(
                        new String("hello"),
                        new Integer(1),
                        new Double(1))));
        object6.add(mapForObject6);
        object6.add(Arrays.asList(new String("hello"),
                new Integer(1),
                new Double(1)));
        Set setForObject6 = new HashSet();
        setForObject6.add(new Integer(1));
        setForObject6.add(new Double(1));
        setForObject6.add(new String("hello"));
        object6.add(setForObject6);
        res = incrementObject.increment(object6);
        System.out.println(res.toString());
    }
}
