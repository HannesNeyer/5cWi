package algorithmen.datagenerator;

import java.util.Random;

public class DataGenerator {

    public static int[] generateDataArray(int size, int[] dataArray) {

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int number = rand.nextInt();
            dataArray[i] = number;
        }
        return dataArray;
    }

    public static int[] generateDataArrayMinMax(int size, int min, int max, int[] dataArray) {
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int number = rand.nextInt(max + 1 - min) + min;
            dataArray[i] = number;
        }
        return dataArray;
    }

    public void printArray(int[] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println();
    }

    public int getSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

    public int[] getDataArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataArray'");
    }

    public int getMin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMin'");
    }

}
