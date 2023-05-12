package test;

import data.Point;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FTest {
    @Test
    public void checkArea() {
        assertAll(
                () -> {
                    Point point = new Point();
                    point.setxValue(1.0);
                    point.setyValue(-1.0);
                    point.setrValue(2.0);
                    point.checkHit();
                    assertEquals(false, point.getHitResult());
                }
        );
    }
}
