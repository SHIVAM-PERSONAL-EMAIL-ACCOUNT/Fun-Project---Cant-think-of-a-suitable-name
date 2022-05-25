import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IncrementNumberTest {

    private IncrementNumber<Object> incrementIfNumber;

    @Before
    public void beforeAll() {
        incrementIfNumber = new IncrementNumber<>();
    }

    @Test
    public void givenNumberOfTypeInteger_whenIncrement_returnObjectOfIntegerIncrementedByOne() {
        Object object = Integer.valueOf(1);

        Object actualAnswer = incrementIfNumber.increment(object);
        Object expectedAnswer = Integer.valueOf(2);

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void givenNumberOfTypeDouble_whenIncrement_returnObjectOfDoubleIncrementedByOne() {
        Object object = Double.valueOf(1);

        Object actualAnswer = incrementIfNumber.increment(object);
        Object expectedAnswer = Double.valueOf(2);

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void givenNumberOfTypeLong_whenIncrement_returnObjectOfLongIncrementedByOne() {
        Object object = Long.valueOf(1);

        Object actualAnswer = incrementIfNumber.increment(object);
        Object expectedAnswer = Long.valueOf(2);

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void givenNumberOfTypeShort_whenIncrement_returnObjectOfShortIncrementedByOne() {
        Object object = Short.valueOf((short) 1);

        Object actualAnswer = incrementIfNumber.increment(object);
        Object expectedAnswer = Short.valueOf((short) 2);

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void givenNumberOfTypeFloat_whenIncrement_returnObjectOfFloatIncrementedByOne() {
        Object object = Float.valueOf(1F);

        Object actualAnswer = incrementIfNumber.increment(object);
        Object expectedAnswer = Float.valueOf(2F);

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void givenObjectNotOfTypeNumber_whenIncrement_returnObjectWithoutChange() {
        Object object = new String ("Test");

        Object actualAnswer = incrementIfNumber.increment(object);
        Object expectedAnswer = new String ("Test");

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
}