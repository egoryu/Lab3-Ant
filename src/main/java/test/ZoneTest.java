package test;

import data.Point;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZoneTest {
    @Test
    public void checkTriangle() {
        Point point = new Point();
        assertAll(
                () -> {
                    point.setxValue(-1.0);
                    point.setyValue(0.0);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkTriangle());
                },
                () -> {
                    point.setxValue(0.0);
                    point.setyValue(0.0);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkTriangle());
                },
                () -> {
                    point.setxValue(0.0);
                    point.setyValue(-0.5);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkTriangle());
                },
                () -> {
                    point.setxValue(-1.0);
                    point.setyValue(-1.0);
                    point.setrValue(3.0);
                    assertEquals(true, point.checkTriangle());
                },
                () -> {
                    point.setxValue(-2.0);
                    point.setyValue(0.0);
                    point.setrValue(1.0);
                    assertEquals(false, point.checkTriangle());
                },
                () -> {
                    point.setxValue(1.0);
                    point.setyValue(0.0);
                    point.setrValue(2.0);
                    assertEquals(false, point.checkTriangle());
                }
        );
    }

    @Test
    public void checkRectangle() {
        Point point = new Point();
        assertAll(
                () -> {
                    point.setxValue(0.0);
                    point.setyValue(-1.0);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkRectangle());
                },
                () -> {
                    point.setxValue(0.0);
                    point.setyValue(0.0);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkRectangle());
                },
                () -> {
                    point.setxValue(1.0);
                    point.setyValue(-1.0);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkRectangle());
                },
                () -> {
                    point.setxValue(1.0);
                    point.setyValue(0.0);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkRectangle());
                },
                () -> {
                    point.setxValue(1.0);
                    point.setyValue(-1.5);
                    point.setrValue(2.0);
                    assertEquals(true, point.checkRectangle());
                },
                () -> {
                    point.setxValue(1.0);
                    point.setyValue(1.0);
                    point.setrValue(2.0);
                    assertEquals(false, point.checkRectangle());
                }
        );
    }

    @Test
    public void checkCircle() {
        Point point = new Point();
        assertAll(
                () -> {
                    point.setxValue(1.0);
                    point.setyValue(0.0);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkCircle());
                },
                () -> {
                    point.setxValue(0.0);
                    point.setyValue(0.0);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkCircle());
                },
                () -> {
                    point.setxValue(0.0);
                    point.setyValue(1.0);
                    point.setrValue(1.0);
                    assertEquals(true, point.checkCircle());
                },
                () -> {
                    point.setxValue(1.0);
                    point.setyValue(1.0);
                    point.setrValue(3.0);
                    assertEquals(true, point.checkCircle());
                },
                () -> {
                    point.setxValue(2.0);
                    point.setyValue(0.0);
                    point.setrValue(1.0);
                    assertEquals(false, point.checkCircle());
                },
                () -> {
                    point.setxValue(-1.0);
                    point.setyValue(0.0);
                    point.setrValue(2.0);
                    assertEquals(false, point.checkCircle());
                }
        );
    }

    @Test
    public void checkHit() {
        Point point = new Point();
        assertAll(
                () -> {
                    point.setxValue(1.0);
                    point.setyValue(0.5);
                    point.setrValue(3.0);
                    point.checkHit();
                    assertEquals(true, point.getHitResult());
                },
                () -> {
                    point.setxValue(0.2);
                    point.setyValue(-0.4);
                    point.setrValue(1.0);
                    point.checkHit();
                    assertEquals(true, point.getHitResult());
                },
                () -> {
                    point.setxValue(-0.5);
                    point.setyValue(-0.5);
                    point.setrValue(3.0);
                    point.checkHit();
                    assertEquals(true, point.getHitResult());
                },
                () -> {
                    point.setxValue(-1.0);
                    point.setyValue(1.0);
                    point.setrValue(3.0);
                    point.checkHit();
                    assertEquals(false, point.getHitResult());
                }
        );
    }
}
