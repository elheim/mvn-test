import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    public void checkCorrectAreaCalculator() {
        Triangle triangle = new Triangle(3, 4, 5);
        double area = triangle.calcArea();

        assertEquals(6, area);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    public void checkCorrectA(int a) {
        assertThrows(IllegalArgumentException.class,
                () -> new Triangle(a, 4, 5));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    public void checkCorrectB(int b) {
        assertThrows(IllegalArgumentException.class,
                () -> new Triangle(3, b, 5));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    public void checkCorrectC(int c) {
        assertThrows(IllegalArgumentException.class,
                () -> new Triangle(3, 4, c));
    }

    @Test
    public void checkNewA() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertThrows(IllegalArgumentException.class,
                () -> triangle.setA(-10));
    }

    @Test
    public void checkNewB() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertThrows(IllegalArgumentException.class,
                () -> triangle.setB(-10));
    }

    @Test
    public void checkNewC() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertThrows(IllegalArgumentException.class,
                () -> triangle.setC(-10));
    }

    @Test
    public void checkAreaAfterNewA() {
        Triangle triangle = new Triangle(3,4, 5);
        triangle.setA(4);
        double eps = 1e-12;
        assertTrue(Math.abs(triangle.calcArea() - 7.806247497997997) < eps);
        //assertEquals(7.8, triangle.calcArea());
    }

    @Test
    public void checkAreaAfterNewB() {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.setB(7);
        double eps = 1e-12;
        assertTrue(Math.abs(triangle.calcArea() - 6.49519052838329) < eps);
        //assertEquals(6.5, triangle.calcArea());

    }

    @Test
    public void checkAreaAfterNewC() {
        Triangle triangle = new Triangle(3, 4,5);
        triangle.setC(6);
        double eps = 1e-12;
        assertTrue(Math.abs(triangle.calcArea() - 5.332682251925386) < eps);
        //assertEquals(5.3, triangle.calcArea());
    }
}
