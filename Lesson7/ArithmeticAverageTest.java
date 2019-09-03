import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticAverageTest {

    ArithmeticAverage aa = new ArithmeticAverage();
    static int a;
    static int b;

    @BeforeAll
    public static void init() {

    }

    @BeforeEach
    public static void initEach() {
        a = -5;
        b = 12;
    }

    @Test
    public void isArithmeticAver()
    {
        this.initEach();
        double expected = 15;
        double actual = aa.theArithmeticAverageOfAllNumbers(a, b);
        Assertions.assertEquals(expected, actual, "Expected is Fail");
    }

    @BeforeEach
    public static void initEach2() {
        a = 0;
        b = 9;
    }

    @Test
    public void isArithmeticAver2()
    {
        this.initEach2();
        double expected = 6;
        double actual = aa.theArithmeticAverageOfAllNumbers(a, b);
        Assertions.assertEquals(expected, actual, "Arithmetic average of all numbers from the interval which are divisible by 3.");
    }
    @BeforeEach
    public static void initEach3() {
        a = 0;
        b = 0;
    }

    @Test
    public void isArithmeticAver3()
    {
        this.initEach3();
        double expected = 0;
        double actual = aa.theArithmeticAverageOfAllNumbers(a, b);
        Assertions.assertEquals(expected, actual, "Arithmetic average of all numbers from the interval does not divisible by 3.");
    }

}
