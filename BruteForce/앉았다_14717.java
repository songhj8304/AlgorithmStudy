import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 앉았다_14717 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        List<Integer> card = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= 10; j++) {
                card.add(j);
            }
        }

        card.remove(Integer.valueOf(A));
        card.remove(Integer.valueOf(B));

        int win = 0;
        int total = 0;

        for (int i = 0; i < card.size(); i++) {
            for (int j = 0; j < card.size(); j++) {
                if (i != j) {
                    if (getScore(A, B) > getScore(card.get(i), card.get(j))) {
                        win++;
                    }
                    total++;
                }
            }
        }

        System.out.printf("%.3f\n", (double) win / total);
    }

    private static int getScore(int A, int B) {
        if (A == B){
            return A + 10;
        } else {
            return (A + B) % 10;
        }
    }
}

