package lesson4z;

public class FindDivCount {
    public int findDivCount(short a, short b, int n) {
        if (n > 0 && 0 <= a && a <= b) {
            int count = 0;
            for (int i = a; i <= b; i++) {
                if (i % n == 0)
                    count++;
            }
            return count;
        }
        return 0;
    }
}
