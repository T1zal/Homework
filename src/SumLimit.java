public class SumLimit {

    public static int sumLimit(int a, int b) {
        int sum = a + b;
        int digitsA = String.valueOf(a).length();
        int digitsSum = String.valueOf(sum).length();

        if (digitsSum > digitsA) {
            return a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3)); // 5
        System.out.println(sumLimit(8, 3)); // 8
        System.out.println(sumLimit(8, 1)); // 9
    }
}