package lesson4z;

public class CompareSums {
    public static boolean compareSums(int a, int b, int c, int d) {
        boolean res;
        if (sum(a, b) > sum(c, d))
            res = true;
        else
            res = false;
        return res;
    }

    private static long sum(int from, int to) {
        long res = 0;
        if (from <= to) {
            for (int i = from; i <= to; i++) {
                res += i;
            }
        } else {
            for (int i = to; i <= from; i++) {
                res += i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(compareSums(3,5,2147483647,2147483647));
    }
}