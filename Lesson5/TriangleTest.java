import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

        Triangle triangle = new Triangle();

        @Test
        public void testTriangle()
        {
            int a = 7;
            int b = 7;
            int c = 10;
            String expected = "YES";

            String actual = triangle.isTriangle(a, b, c);
            Assertions.assertEquals(expected, actual, "Check that triangle with sides exists");
        }

        @Test
        public void notTriangle()
        {
           int a = 0;
           int b = 0;
           int c = 0;
           String expected = "No";

           String actual = triangle.isTriangle(a, b, c);
           Assertions.assertEquals(expected, actual, "Check that triangle with sides does not exists");
        }

        @Test
        public void negativeTriangle()
        {
            int a = -10;
            int b = -2;
            int c = -7;
            String expected ="No";

            String actual = triangle.isTriangle(a, b, c);
            Assertions.assertEquals(expected, actual, "Check that triangle with sides does not exists");
        }
}