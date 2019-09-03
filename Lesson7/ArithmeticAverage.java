
public class ArithmeticAverage {

    public static double theArithmeticAverageOfAllNumbers(int a, int b) {

        int sum = 0;
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                cnt++;
            }
        }

        double avg = (double) sum / cnt;

        return avg;
    }
}