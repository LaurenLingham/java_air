import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneModel.BOEING_747);
    }

    @Test
    public void hasModel() {
        assertEquals(PlaneModel.BOEING_747, plane.getModel());
    }

    @Test
    public void hasCapacity() {
        assertEquals(PlaneModel.BOEING_747.getCapacity(), plane.getModel().getCapacity());
    }

    @Test
    public void hasWeight() {
        assertEquals(PlaneModel.BOEING_747.getWeight(), plane.getModel().getWeight());
    }
}
