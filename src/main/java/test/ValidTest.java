package test;

import data.Point;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidTest {
    @Test
    public void checkX() {
        Point point = new Point();
        assertAll(
                () -> {
                    point.setxValue(1.0);
                    assertEquals(true, point.validateX());
                },
                () -> {
                    point.setxValue(4.0);
                    assertEquals(true, point.validateX());
                },
                () -> {
                    point.setxValue(5.0);
                    assertEquals(false, point.validateX());
                },
                () -> {
                    point.setxValue(4.00001);
                    assertEquals(false, point.validateX());
                },
                () -> {
                    point.setxValue(-4.0);
                    assertEquals(true, point.validateX());
                },
                () -> {
                    point.setxValue(-4.00001);
                    assertEquals(false, point.validateX());
                }
        );
    }

    @Test
    public void checkY() {
        Point point = new Point();
        assertAll(
                () -> {
                    point.setyValue(1.0);
                    assertEquals(true, point.validateY());
                },
                () -> {
                    point.setyValue(3.0);
                    assertEquals(true, point.validateY());
                },
                () -> {
                    point.setyValue(5.0);
                    assertEquals(false, point.validateY());
                },
                () -> {
                    point.setyValue(3.00001);
                    assertEquals(false, point.validateY());
                },
                () -> {
                    point.setyValue(-5.0);
                    assertEquals(true, point.validateY());
                },
                () -> {
                    point.setyValue(-5.01);
                    assertEquals(false, point.validateY());
                }
        );
    }

    @Test
    public void checkR() {
        Point point = new Point();
        assertAll(
                () -> {
                    point.setrValue(1.0);
                    assertEquals(true, point.validateR());
                },
                () -> {
                    point.setrValue(3.0);
                    assertEquals(true, point.validateR());
                },
                () -> {
                    point.setrValue(5.0);
                    assertEquals(false, point.validateR());
                },
                () -> {
                    point.setrValue(3.00001);
                    assertEquals(false, point.validateR());
                },
                () -> {
                    point.setrValue(-5.0);
                    assertEquals(false, point.validateR());
                },
                () -> {
                    point.setrValue(1.01);
                    assertEquals(false, point.validateR());
                }
        );
    }
}
