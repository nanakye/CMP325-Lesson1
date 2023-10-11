import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MathsTest {
    Maths maths;

    @Before
    public void setUpInstance() {
        maths = new Maths();
    }

    @Test
    public void checkTheSumOfTwoNumbersEqualsToThree(){
        Assert.assertEquals(3, maths.addTwoNumbers(9, 7));
    }

    @Test
    public void checkTheSumOfTwoNumbersEqualsToThreeAgain(){
        assertEquals(3, maths.addTwoNumbers(1, 2));
    }

    @Test
    public void checkThePrime(){
        Assert.assertEquals(true, maths.checkIfNumberIsPrime(7));
    }
}
