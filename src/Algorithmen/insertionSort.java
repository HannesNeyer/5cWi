package algorithmen;

public class InsertionSort implements Sorter {

    @Override
    public int[] sort(int[] data) {
        int quantity = data.length;

        for (int i = 1; i < quantity; ++i) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }

}