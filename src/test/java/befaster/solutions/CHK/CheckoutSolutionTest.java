package befaster.solutions.CHK;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckoutSolutionTest {

    CheckoutSolution checkoutSolution;

    @Before
    public void setUp() throws Exception {
        checkoutSolution = new CheckoutSolution();
    }

    @Test
    public void checkoutNothing() {

        Assert.assertEquals(java.util.Optional.of(0).get(), checkoutSolution.checkout(""));
    }
}