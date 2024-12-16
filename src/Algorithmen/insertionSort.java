package algorithmen;

public class insertionSort{

    private int[] arr;
    private int quantity;

    public void insertionSort(){
        for (int i = 1; i < quantity; i++) {
        int comparisonNumber = arr[i];
        int currentNumber = i - 1;

        while (currentNumber >= 0 && arr[currentNumber] > comparisonNumber) {
            arr[currentNumber + 1] = arr[currentNumber];
            currentNumber = currentNumber - 1;
        }
        arr[currentNumber + 1] = comparisonNumber;}
    }

    public void printArray() { 
        for (int i = 0; i < quantity; i++) { 
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
