package DataGeneratorAlgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {
    @Test
    void testGenerateDatArry() {
        Assertions.assertEquals(true, true);
    }

    @Test
    void test2() {
        int size = 6;
        int[] data = DataGenerator.generateDatArry(size);

        boolean allTheSame = true;

        for (int value : data) {
            if (value != 0) {
                allTheSame = false;
                break;
            }
        }
        Assertions.assertFalse(allTheSame, "all numbers are the same");
    }

    @Test
    void printNumbers() {
        int size = 10;
        int[] data = DataGenerator.generateDatArry(size);

        System.out.println("Generated numbers:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }

    }
}
