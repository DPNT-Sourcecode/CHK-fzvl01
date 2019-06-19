package befaster.solutions.HLO;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {

    private HelloSolution helloSolution;

    @Before
    public void setUp() {
        helloSolution = new HelloSolution();
    }

    @Test
    public void hello() {
        String expected = "Hello, World!";

        String actual = helloSolution.hello("");

        Assert.assertEquals(expected, actual);
    }
}
