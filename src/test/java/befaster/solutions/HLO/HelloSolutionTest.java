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
    public void helloNobody() {
        String expected = "Hello, !";

        String actual = helloSolution.hello("");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void helloJohn() {
        String expected = "Hello, John!";

        String actual = helloSolution.hello("John");

        Assert.assertEquals(expected, actual);
    }
}