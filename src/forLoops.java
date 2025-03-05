public class forLoops {
    public static void main(String[] args) {
        // sum of the first 10 numbers
        int sum = 0;
        int[] myNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < 10; i++) {
            sum = myNum[i] + sum;
        }
        System.out.println(sum);

        // sum of every third number
        int[] myNum1 = {};
        int sum1 = 0;

        for (int i = 1; i < 31; i++) {
            myNum1[i] = i;
        }

        for (int j = 0; j < 30; j += 3) {
            sum1 = myNum[j] + sum1;
        }
        System.out.println(sum1);

        // even number between 10 and 20
        int[] myNum2 = {};
        int sum2 = 0;

        for (int i = 10; i < 21; i++) {
            myNum2[i] = i;
        }

        for (int j = 0; j < 20; j += 3) {
            if (j % 2 == 0) {
                sum2 = myNum[j] + sum2;
                System.out.println(sum2);
            }
        }

        // uneven number between 10 and 20
        int[] myNum3 = {};
        int sum3 = 0;

        for (int i = 10; i < 21; i++) {
            myNum3[i] = i;
        }

        for (int j = 0; j < 20; j += 3) {
            if (j % 2 == 1) {
                sum3 = myNum[j] + sum3;
                System.out.println(sum3);
            }
        }

        // Count down from 10 to 1
        for (int i = 9; i > -1; i--) {
            System.out.println(myNum[i]);
        }

        // sum of squares
        int myNum4[] = { 1, 2, 3, 4, 5 };
        int sum4 = 0;

        for (int i = 0; i < 5; i++) {
            sum4 = myNum4[i] * myNum4[i];
        }
        System.out.println(sum4);

        // Find the product of the first 5 numbers
        int sum5 = 0;
        for (int i = 1; i < 5; i++) {
            sum5 += myNum4[i] * myNum4[i + 1];
        }
        System.out.println(sum5);

        // Print the multiplication table of 3
        int sum6 = 0;
        for (int i = 0; i < 30; i++) {
            sum6 += myNum1[i] * 3;
        }
        System.out.println(sum6);
    }

}