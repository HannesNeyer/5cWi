package algorithmen;

public class SeletionSort implements Sorter {

    @Override
    public int[] sort(int[] data) {
        int quantity = data.length;

        for (int i = 0; i < quantity - 1; ++i) {
            int min_idx = i;

            for (int j = i + 1; j < quantity; ++j) {
                if (data[j] < data[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = data[i];
            data[i] = data[min_idx];
            data[min_idx] = temp;
        }
        return data;
    }

}
