import java.util.Scanner;

public class Boj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subNum = sc.nextInt();
        long sum = 0;
        long max = 0;
        for (int i = 0; i < subNum; i++) {
            int temp = sc.nextInt();
            sum += temp;
            if (temp > max)
                max = temp;
        }
        System.out.println(sum * 100.0 / max / subNum);
    }
}
