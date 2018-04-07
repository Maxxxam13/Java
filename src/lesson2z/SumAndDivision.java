package lesson2z;

public class SumAndDivision {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        boolean bool = sum / 1234 < sum % 1234;
        System.out.println(bool);
    }
}
