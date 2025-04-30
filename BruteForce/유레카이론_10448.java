import java.util.Scanner;

public class 유레카이론_10448{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] input_arr = new int[size];

        for (int i = 0; i < size; i++) {
            input_arr[i] = scanner.nextInt();
        }

        int[] triangle_arr = new int[45];
        for (int i = 0; i < 45; i++) {
            triangle_arr[i] = i * (i + 1) / 2;
        }

        int i = 0;
        while (i < size) {
            int result = 0;
            for (int k = 1; k < 45; k++) {
                for (int l = 1; l < 45; l++) {
                    for (int m = 1; m < 45; m++) {
                        if (triangle_arr[k] + triangle_arr[l] + triangle_arr[m] == input_arr[i]) {
                            result = 1;
                            break;
                        }
                    }
                }
            }
            System.out.println(result);
            i++;
        }
    }
}
