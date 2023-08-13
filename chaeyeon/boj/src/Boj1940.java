import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // elemNum: 재료 갯수
        int elemNum = Integer.parseInt(br.readLine());
        // num: 갑옷이 되는 번호
        int num = Integer.parseInt(br.readLine());
        // a[]: 재료들의 고유번호 저장하는 배열
        int[] a = new int[elemNum];
        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < elemNum; i++)
            a[i] = Integer.parseInt(token.nextToken());
        // a 배열 오름차순 정렬
        Arrays.sort(a);
        int count = 0 ;
        int startIdx = 0;
        int endIdx = elemNum - 1;
        while (startIdx < endIdx) {
            if (a[startIdx] + a[endIdx] == num) {
                count++;
                startIdx++;
                endIdx--;
            }
            else if (a[startIdx] + a[endIdx] < num)
                startIdx++;
            else if (a[startIdx] + a[endIdx] > num)
                endIdx--;
        }
        System.out.println(count);
    }
}
