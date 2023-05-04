package by.itacademy.andreialiasiuk;

import by.itacademy.andreialiasiuk.CircleArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleAreaTest {
@Test
    public void testCircleArea(){
        double expected =380.132711084365;

        double actual = CircleArea.calcCircleArea(11);

        Assertions.assertEquals(actual,expected);

    }
}
