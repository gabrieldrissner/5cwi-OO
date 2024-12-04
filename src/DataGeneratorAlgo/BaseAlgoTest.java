package DataGeneratorAlgo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BaseAlgoTest {
    @Test
    void testRevertDataWithRegularArray() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 5, 4, 3, 2, 1 }; //fixe Werte mitgeben

        int[] result = BaseAlgo.revertData(input); //überprft revertetData, Verschiebung

        assertArrayEquals(expected, result, "korrektes Array");
    }

    @Test
    void testRevertDataWithEmptyArray() {
        int[] input = {};
        int[] expected = {}; //leere Werte

        int[] result = BaseAlgo.revertData(input);

        assertArrayEquals(expected, result, "leeres Array zurückgeben"); //soll leeres Array zurückliefern
    }

    @Test
    void testRevertDataWithSingleElementArray() {
        int[] input = { 42 }; //nur eine Zahl mitgeben
        int[] expected = { 42 };

        int[] result = BaseAlgo.revertData(input);

        assertArrayEquals(expected, result, "einzelnes Array, soll selben Wert zurückgeben");
    }

    @Test
    void testRevertDataWithNegativeNumbers() {
        int[] input = { -1, -2, -3 }; //negative Zahlen
        int[] expected = { -3, -2, -1 };

        int[] result = BaseAlgo.revertData(input);

        assertArrayEquals(expected, result, "Array funktioniert auch mit negativen Zahlen");
    }

    @Test
    void testRevertDataWithMixedNumbers() {
        int[] input = { 0, -1, 2, -3, 4 }; //gemischte Zahlen
        int[] expected = { 4, -3, 2, -1, 0 };

        int[] result = BaseAlgo.revertData(input);

        assertArrayEquals(expected, result, "Array sollte normal funktionieren");
    }
}
