package algorithmen;

public class bubbleSort {

    private int[] arr;
    private int quantity = arr.length;

    public void bubbleSort(){
        for (int i = 0; i < quantity - 1; i++){
            for (int j = 0; j < quantity - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                  
                    int switchValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = switchValue;
                }
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
