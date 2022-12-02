import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestShape {
    private Rectangle rectangle;
    private Square square;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle();
        square = new Square();
    }

    @Test
    public void testRectangle() {
        rectangle.setWidth(4);
        rectangle.setLength(5);
        Assert.assertEquals(rectangle.area(), 20);
    }

    @Test
    public void testSquare() {
        square.setSide(4);
        Assert.assertEquals(square.area(), 16);
    }
}
