import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CircularRoomTest {
    @Test
    void testArea() {
        assertThat(new CircularRoom(10.0).getArea(), is(314.159));
    }
}
