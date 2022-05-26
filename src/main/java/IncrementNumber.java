public class IncrementNumber<Object> {

    public Object increment(Object object) {
        if (object instanceof Integer) return incrementInteger(object);
        else if (object instanceof Double) return incrementDouble(object);
        else if (object instanceof Float) return incrementFloat(object);
        else if (object instanceof Long) return incrementLong(object);
        else if (object instanceof Short) return incrementShort(object);
        // add more Number-types

        return object;
    }

    private Object incrementInteger(Object object) {
        return (Object) Integer.valueOf(((Integer)object) + 1);
    }

    private Object incrementDouble(Object object) {
        return (Object) Double.valueOf(((Double)object) + 1);
    }

    private Object incrementFloat(Object object) {
        return (Object) Float.valueOf(((Float)object) + 1);
    }

    private Object incrementLong(Object object) {
        return (Object) Long.valueOf(((Long)object) + 1);
    }

    private Object incrementShort(Object object) {
        return (Object) Short.valueOf((short)(((Short)object) + 1));
    }
}
