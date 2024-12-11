package Algorithmen;

import java.util.Random;

public class DataGenerator {
    private int size;
    private int min;
    private int max;
    private int[] dataArray;

    public int[] generateDataArray(int size) {
        this.size = size;
        dataArray = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int number = rand.nextInt();
            dataArray[i] = number;
        }
        return dataArray;
    }

    public int[] generateDataArrayMinMax(int size, int min, int max) {
        this.size = size;
        this.min = min;
        this.max = max;
        dataArray = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int number = rand.nextInt(max + 1 - min) + min;
            dataArray[i] = number;
        }
        return dataArray;
    }

    public void printArray() {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int[] getDataArray() {
        return dataArray;
    }

    public void setDataArray(int[] dataArray) {
        this.dataArray = dataArray;
    }
}
