package lesson8z.math;

public class Arithmetic {
    boolean check(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int element : array) {
            if (element > max)
                max = element;
            if (element < min)
                min = element;
        }
        return max + min > 100;
    }
}
