import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class PaintCalculatorTest {
    @Test
    void testCalculateSquareRoom() {
        PaintCalculator pc = new PaintCalculator(new SquareRoom(10.0, 10.0));
        assertThat(pc.getGallonsOfPaintForCeiling(), is(1));
    }
    @Test
    void testCalculateLargeSquareRoom() {
        PaintCalculator pc = new PaintCalculator(new SquareRoom(50.0, 50.0));
        assertThat(pc.getGallonsOfPaintForCeiling(), is(8));
    }
    @Test
    void testCalculateCircularRoom() {
        PaintCalculator pc = new PaintCalculator(new CircularRoom(10.0));
        assertThat(pc.getGallonsOfPaintForCeiling(), is(1));
    }
}