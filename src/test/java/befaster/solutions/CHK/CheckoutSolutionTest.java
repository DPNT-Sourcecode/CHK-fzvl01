package befaster.solutions.CHK;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckoutSolutionTest {

    private CheckoutSolution checkoutSolution;

    @Before
    public void setUp() {
        checkoutSolution = new CheckoutSolution();
    }

    @Test
    public void checkoutNothing() {
        assertEquals(0, checkoutSolution.checkout("").intValue());
    }

    @Test
    public void checkoutSingleItem() {
        assertEquals(50, checkoutSolution.checkout("A").intValue());
    }

    @Test
    public void checkoutMultipleDifferentItems() {
        assertEquals(85, checkoutSolution.checkout("ACD").intValue());
    }

    @Test
    public void checkoutInvalidSKU() {
        assertEquals(-1, checkoutSolution.checkout("X").intValue());
    }

    @Test
    public void checkoutMultiBuy() {
        assertEquals(130, checkoutSolution.checkout("AAA").intValue());
    }

    @Test
    public void checkoutTwoBAndFiveA() {
        assertEquals(365, checkoutSolution.checkout("AAABBAAAAC").intValue());
    }

    @Test
    public void checkoutCrossMultiBuy() {
        assertEquals(80, checkoutSolution.checkout("EBE").intValue());
    }

    @Test
    public void checkoutManyCrossMultiBuy() {
        assertEquals(110, checkoutSolution.checkout("EBEB").intValue());
    }

    @Test
    public void checkoutTwoF() {
        assertEquals(20, checkoutSolution.checkout("FF").intValue());
    }

    @Test public void checkoutThreeF() {
        assertEquals(20, checkoutSolution.checkout("FFF").intValue());
    }
}