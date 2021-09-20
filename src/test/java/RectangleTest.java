import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    @Test
    public void checkCorrectAreaCalculation() {
        Rectangle rectangle = new Rectangle(10, 15);

        int area = rectangle.calcArea();

        assertEquals(150, area);
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0})
    public void checkCorrectHeight(int height) {
        assertThrows(IllegalArgumentException.class,
                () ->  new Rectangle(height, 15));
    }


    @Test
    public void checkCorrectWeight() {
        assertThrows(IllegalArgumentException.class,
                () -> new Rectangle(10, -15));
    }

    @Test
    public void checkNewHeight() {
        Rectangle rectangle = new Rectangle(10, 15);
        assertThrows(IllegalArgumentException.class,
                () -> rectangle.setHeight(-10));
    }

    @Test
    public void checkNewWeigth() {
        Rectangle rectangle = new Rectangle(10, 15);
        assertThrows(IllegalArgumentException.class,
                () -> rectangle.setWeight(-10));
    }

    @Test
    public void checkAreaAfterNewHeight() {
        Rectangle rectangle = new Rectangle(10, 15);
        rectangle.setHeight(20);

        assertEquals( 300, rectangle.calcArea());
    }

    @Test
    public void checkAreaAfterNewWeight() {
        Rectangle rectangle = new Rectangle(10, 15);
        rectangle.setWeight(20);

        assertEquals(200, rectangle.calcArea());
    }
}
