package algorithmen.datagenerator;

public class main {
    public static void main(String[] args) {
        DataGenerator DG = new DataGenerator();
        BaseDataGenerator BDG = new BaseDataGenerator();
        DG.printArray();
        BDG.printArray(BDG.ReverseDataArray());
        BDG.printArray(BDG.ReverseDataArrayMinMax());
    }
}
