import java.util.Scanner;

public class Boj2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int startIdx = 1;
        int endIdx = 1;
        int sum = 1;

        while (endIdx != n) {
            if (sum == n) {
                count++;
                sum += ++endIdx;
            }
            else if (sum > n)
                sum -= startIdx++;
            else if (sum < n)
                sum += ++endIdx;
        }
        System.out.println(count);
    }
}
