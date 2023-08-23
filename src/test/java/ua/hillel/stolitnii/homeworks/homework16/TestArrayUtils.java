package ua.hillel.stolitnii.homeworks.homework16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayUtils {

    @Test
    void testCalculateAverage() {
        Main arrayUtils = new Main();
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3.0, arrayUtils.calculateAverage(array));
    }

    @Test
    void testCalculateAverageEmptyArray() {
        Main arrayUtils = new Main();
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> arrayUtils.calculateAverage(array));
    }

    @Test
    void testIsSquareMatrix() {
        Main arrayUtils = new Main();
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(arrayUtils.isSquareMatrix(squareMatrix));
    }

    @Test
    void testIsSquareMatrixNonSquare() {
        Main arrayUtils = new Main();
        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};
        assertFalse(arrayUtils.isSquareMatrix(nonSquareMatrix));
    }

    @Test
    void testIsSquareMatrixNullMatrix() {
        Main arrayUtils = new Main();
        int[][] nullMatrix = null;
        assertThrows(IllegalArgumentException.class, () -> arrayUtils.isSquareMatrix(nullMatrix));
    }
}
