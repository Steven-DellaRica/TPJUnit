package dev.levenshtein;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertionsTest {
    @Test
    void assertEqualsListTest(){

        //List<String> = ;
    }

    @Test
    void assertEqualsArrayTest() {
        int[] expected = new int[]{1, 2, 3, 4, 5};

        int[] actual = new int[]{1, 2, 3, 4, 5};

        assertArrayEquals(expected, actual);
    }

    @Test
    void assertThrowsTest() {
        assertThrows(NullPointerException.class, null);
    }
}
