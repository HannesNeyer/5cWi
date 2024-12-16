package algorithmen;

public class BubbleSort implements Sorter {

    @Override
    public int[] sort(int[] data) {
        int quantity = data.length;
      
        for (int i = 0; i < quantity - 1; i++)
            for (int j = 0; j < quantity - i - 1; j++)
                if (data[j] > data[j + 1]) {

                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}
