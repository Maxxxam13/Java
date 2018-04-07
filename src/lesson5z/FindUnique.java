package lesson5z;

import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {
        int[] array = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11,13,12,0,0,0};
        System.out.println(uniqueCount(array));
    }

    static int uniqueCount(int[] array) {
        if (array.length > 0) {
            int res = 0;
            int count;
            int[] ar = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                count = 0;
                for (int j = 0; j < res; j++) {
                    if (array[i] == ar[j]) {
                        count++;
                    }
                }
                if (count == 0) {
                    ar[res] = array[i];
                    res++;
                }
            }
            //System.out.println(Arrays.toString(ar));
            return res;
        }
        return 0;
    }
}
