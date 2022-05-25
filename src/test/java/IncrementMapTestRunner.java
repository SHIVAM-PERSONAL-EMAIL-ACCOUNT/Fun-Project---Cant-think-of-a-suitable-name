import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class IncrementMapTestRunner {

    public static void main(String args []) {
        Result result = JUnitCore.runClasses(IncrementMapTest.class);

        for (Failure failure : result.getFailures())
            System.out.println(failure.toString() + "\n");

        System.out.println("IncrementMapTest Result = " + result.wasSuccessful());
    }
}
