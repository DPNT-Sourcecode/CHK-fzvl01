package befaster.solutions.HLO;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {

    private HelloSolution helloSolution;

    @Before
    public void setUp() throws Exception {
        helloSolution = new HelloSolution();
    }

    @Test
    public void hello() {
        String expected = "Hello World!";

        String actual = helloSolution.hello("");

        Assert.assertEquals(expected, actual);
    }
}