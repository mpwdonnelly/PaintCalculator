import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SquareRoomTest {
    @Test
    void testArea() {
        assertThat(new SquareRoom(10.0, 10.0).getArea(), is(100.0));
    }
}