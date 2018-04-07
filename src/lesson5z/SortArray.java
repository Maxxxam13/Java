package lesson5z;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 3, 7, 4, 1};
        System.out.println(Arrays.toString(sortAscending(array1)));
        int[] array2 = {2, 5, 3, 7, 4, 1};
        System.out.println(Arrays.toString(sortDescending(array2)));
    }

    static int[] sortAscending(int[] array) {
        int k;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
        return array;
    }

    static int[] sortDescending(int[] array) {
        int k;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
        return array;
    }
}
