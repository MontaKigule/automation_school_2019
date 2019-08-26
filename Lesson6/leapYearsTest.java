import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class leapYearsTest {

    leapYears year = new leapYears();
    int year1;
    int year2;
    int year3;

    @BeforeAll
    public void initAll()
    {
        year1 = 2020;
        year2 = 2019;
        year3 = 0;
    }

    @Test
    public void itIsLeapY()
    {
        this.initAll();
        String expected = "Leap";
        String actual = leapYears.main(year1);
        Assertions.assertEquals(expected, actual, "Check if the given year is a leap year");
    }

    @Test
    public void itIsNotLeapY()
    {
        this.initAll();
        String expected = "Regular";
        String actual = leapYears.main(year2);
        Assertions.assertEquals(expected, actual, "Check if the given year is not leap year");
    }

    @Test
    public void itIsNotY()
    {
        this.initAll();
        String expected = "";
        String actual = leapYears.main(year3);
        Assertions.assertEquals(expected, actual, "Check if the given year is not a year");
    }
}