package algorithmen.SortTests;

import java.util.Random;

public class QuickSortExample {

    // Quicksort implementation
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    // Function to generate random array
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000000);
        }
        return arr;
    }

    // Measure the time for sorting
    public static long measureSortTime(int[] arr) {
        long startTime = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 400000};

        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            long sortTime = measureSortTime(arr);
            System.out.println("Sorting " + size + " elements took " + sortTime + " milliseconds.");
        }
    }
}

