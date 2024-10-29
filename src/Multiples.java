public class Multiples {
    public static void main(String[] args) {
        long sum = 0;

        for (long i = 1; i <= 1000; i++) {
            boolean multiple_of_3 = i % 3 == 0;
            boolean multiple_of_5 = i % 5 == 0;

            if (multiple_of_3) {
                sum += 1;

            } else if (multiple_of_5) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
