package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] intArr = {9, 5, 1, 4, 3};
        insertionSort(intArr);
        System.out.println("Sorted Array is:");
        for (int num : intArr) {
            System.out.println(num);
        }
//        System.out.println(Arrays.toString(intArr));
    }

    static void insertionSort(int[] intArr) {
        for (int i = 1; i < intArr.length; i++) {
            int key = intArr[i];
            int j = i - 1;

            while (j >= 0 && key < intArr[j]) {
                intArr[j + 1] = intArr[j];
                --j;
            }
            intArr[j + 1] = key;
        }
    }
}
