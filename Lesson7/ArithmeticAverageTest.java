import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArithmeticAverageTest {

    ArithmeticAverage aa = new ArithmeticAverage();
    static int a;
    static int b;

    @BeforeAll
    public static void init() {

    }

    @Test
    public void isArithmeticAver()
    {
        a = -5;
        b = 12;
        double expected = 15;
        double actual = aa.theArithmeticAverageOfAllNumbers(a, b);
        Assertions.assertEquals(expected, actual, "Expected is Fail");
    }

    @Test
    public void isArithmeticAver2()
    {
        a = 0;
        b = 9;
        double expected = 6;
        double actual = aa.theArithmeticAverageOfAllNumbers(a, b);
        Assertions.assertEquals(expected, actual, "Arithmetic average of all numbers from the interval which are divisible by 3.");
    }

    @Test
    public void isArithmeticAver3()
    {
        a = 0;
        b = 0;
        double expected = 0;
        double actual = aa.theArithmeticAverageOfAllNumbers(a, b);
        Assertions.assertEquals(expected, actual, "Arithmetic average of all numbers from the interval does not divisible by 3.");
    }

}
