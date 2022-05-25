import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class IncrementMapTest {

    private IncrementMap<Object> incrementMap;

    @Before
    public void beforeAll() {
        incrementMap = new IncrementMap<>();
    }

    @Test
    public void givenMapOfObjectValuesOfTypeNumbers_whenIncrement_returnMapWithNumberObjectsIncrementedByOne() {
        Map<Object,Object> actualMap = new HashMap<>();
        actualMap.put(1, Integer.valueOf(1));
        actualMap.put(2, Double.valueOf(2.3));
        actualMap.put(3, Long.valueOf(-17));

        Map<Object,Object> expectedMap = new HashMap<>();
        expectedMap.put(1, Integer.valueOf(2));
        expectedMap.put(2, Double.valueOf(3.3));
        expectedMap.put(3, Long.valueOf(-16));

        Object actualAnswer = incrementMap.increment(actualMap);
        Object expectedAnswer = expectedMap;

        for (Object key : ((Map<Object,Object>)actualAnswer).keySet())
            Assert.assertEquals(((Map<?, ?>) expectedAnswer).get(key) , ((Map<?, ?>) actualAnswer).get(key));
    }

    @Test
    public void givenMapOfObjectValuesOfTypeNumbersAndMap_whenIncrement_returnMapAndAllValueMapsWithNumberObjectsIncrementedByOne() {
        Map<Object,Object> actualMap = new HashMap<>();
        actualMap.put(1, Integer.valueOf(1));
        actualMap.put(2, Double.valueOf(2.3));

        Map<java.lang.Object, java.lang.Object> valueMap = new HashMap<>();
        valueMap.put(1, Integer.valueOf(21));
        valueMap.put(2, Double.valueOf(26.388));

        actualMap.put(3, valueMap);

        Map<Object,Object> expectedMap = new HashMap<>();
        expectedMap.put(1, Integer.valueOf(2));
        expectedMap.put(2, Double.valueOf(3.3));

        Map<java.lang.Object, java.lang.Object> expectedValueMap = new HashMap<>();
        expectedValueMap.put(1, Integer.valueOf(22));
        expectedValueMap.put(2, Double.valueOf(27.388));
        expectedMap.put(3, expectedValueMap);

        Object actualAnswer = incrementMap.increment(actualMap);
        Object expectedAnswer = expectedMap;

        for (Object key : ((Map<Object,Object>)actualAnswer).keySet())
            Assert.assertEquals(((Map<?, ?>) expectedAnswer).get(key) , ((Map<?, ?>) actualAnswer).get(key));
    }
}