import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooTest {

    @Test
    public void testBar() {
        assertEquals("bar", new Foo().getBar());
    }
}
