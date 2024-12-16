package algorithmen.datagenerator;

public class main {
    public static void main(String[] args) {
        DataGenerator DG = new DataGenerator();
        ReverseDataGenerator BDG = new ReverseDataGenerator();
        DG.printArray(DG.generateDataArray(0, null));
        BDG.printArray(BDG.ReverseDataArray(0));
        BDG.printArray(BDG.ReverseDataArrayMinMax());
    }
}
