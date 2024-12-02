package Algorithmen;

public class main {
    public static void main(String[] args) {
        DataGenerator DG = new DataGenerator();
        DG.printArray(DG.generateDataArray(5));
        DG.printArray(DG.generateDataArrayMinMax(5, 0, 10));
    }
}
