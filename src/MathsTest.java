import org.junit.*;

public class MathsTest {
    Maths maths;

    @Before
    public void setUpInstance() {
        maths = new Maths();
    }

    @Test
    public void checkThePrime(){
        Assert.assertTrue(maths.checkIfNumberIsPrime(7));
    }
}
