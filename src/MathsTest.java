import org.junit.*;

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
        Assert.assertEquals(3, maths.addTwoNumbers(1, 2));
    }

    @Test
    public void checkThePrime(){
        Assert.assertTrue(maths.checkIfNumberIsPrime(7));
    }
}
