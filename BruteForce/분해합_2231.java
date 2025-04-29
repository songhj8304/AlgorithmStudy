import java.util.Scanner;

public class 분해합_2231{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int x = 0;
        for (int i = 0; i < N; i++) {
            int sum = i;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == N) {
                x = i;
                break;
            }
        }
        System.out.println(x);
    }
}
