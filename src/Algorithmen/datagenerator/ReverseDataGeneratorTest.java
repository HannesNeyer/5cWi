package algorithmen.datagenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseDataGeneratorTest {

    @Test
    void testGenerateReverseDataArray() {
        int[] data = ReverseDataGenerator.ReverseDataArray(5);
        for (int i : data) {
            System.out.println("i:" + i);
        }
        Assertions.assertEquals(data.length, 5);

        int[] input = {1,4,2,6};
        int[] expactation = {6,2,4,1};
        Assertions.assertEquals(expactation, expactation);
    }

}
