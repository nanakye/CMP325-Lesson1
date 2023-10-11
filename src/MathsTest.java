import org.junit.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MathsTest {
    Maths maths;

    @Before
    public void setUpInstance() {
        this.maths = new Maths();
    }

    @Test
    public void checkTheSumOfTwoNumbersEqualsThree(){
        Assert.assertEquals(3L, (long)this.maths.addTwoNumbers(5, -2));
    }

    @Test
    public void checkTheSumOfTwoNumbersEqualsThreeAgain(){
        Assert.assertEquals(3L, (long)this.maths.addTwoNumbers(2, 1));
    }

    @Test
    public void checkIfNumberIsPrime(){
        Assert.assertTrue(this.maths.checkPrime(7));}
}

