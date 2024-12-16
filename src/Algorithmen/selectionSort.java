package algorithmen;

public class selectionSort {

    private int[] arr;
    private int quantity = arr.length;

    public void selectionSort() {
        for (int i = 0; i < quantity-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < quantity; j++) {
                if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                }
            }

            int switchValue = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = switchValue;
        }
    }
    
    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] getArr() {
        return arr; 
    } 
    
    public void setArr(int[] arr) {
        this.arr = arr; 
    }  
    
    public int getQuantity() { 
        return quantity; 
    } 
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
