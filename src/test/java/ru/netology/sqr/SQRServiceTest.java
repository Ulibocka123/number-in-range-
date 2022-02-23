package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource (value = {"'test_1', 100, 500, 13",
            "'test_2', 200, 500, 8",
            "'test_3', 300, 500, 5",
            "'test_4', 400, 500, 3",
            "'test_5', 100, 1000, 22",
            "'test_6', 500, 1000, 9"})

    void shouldCountNumbersInRange(String testName, int lowerBorder, int upperBorder, int expected) {

        SQRService service = new SQRService();

        int actual = service.countNumbersInRange(lowerBorder, upperBorder);

        assertEquals(expected, actual);
    }
}