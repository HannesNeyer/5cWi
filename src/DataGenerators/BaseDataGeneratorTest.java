package Algorithmen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseDataGeneratorTest {

    @Test
    void testGenerateReverseDataArray() {
        int[] data = BaseDataGenerator.ReverseDataArray(5);
        for (int i : data) {
            System.out.println("i:" + i);
        }
        Assertions.assertEquals(data.length, 5);

        int[] input = {1,4,2,6};
        int[] expactation = {6,2,4,1};
        Assertions.assertEquals(expactation);
        Assertions.
    }

}
