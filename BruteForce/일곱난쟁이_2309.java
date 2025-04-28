import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine()); //readLine : 한 줄을 문자열로 읽음
            arr[i] = n;
            sum += arr[i];
        }

        Arrays.sort(arr);

        int a = 0;
        int b = 0;

        //안쪽 for문이 맨 마지막 값 체크해줌
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i != a && i != b) {
                System.out.println(arr[i]);
            }
        }
    }
}
