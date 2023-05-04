package by.itacademy.andreialiasiuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageTest {
    @Test
    public void testAverage() {
        double expected = 7.5;

        double actual = Average.calcAverage(10, 5);

        Assertions.assertEquals(actual, expected);
    }
}
