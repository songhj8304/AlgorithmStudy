import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 체스판다시칠하기_1018 {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        String[] size = br.readLine().split(" ");
        int N = Integer.parseInt(size[0]);
        int M = Integer.parseInt(size[1]);

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minResult = Integer.MAX_VALUE;

        // 모든 가능한 8x8 시작 위치에 대해 검사
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int changes = getMinChanges(i, j);
                minResult = Math.min(minResult, changes);
            }
        }

        System.out.println(minResult);
    }

    // 특정 위치 (row, col)에서 8x8 체스판을 다시 칠할 때 필요한 최소 변경 수 반환
    public static int getMinChanges(int row, int col) {
        int whiteFirst = 0; // 시작 색이 W일 때
        int blackFirst = 0; // 시작 색이 B일 때

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[row + i][col + j];
                // (i+j)가 짝수면 시작색, 홀수면 반대색이 되어야 함
                if ((i + j) % 2 == 0) {
                    if (current != 'W') whiteFirst++;
                    if (current != 'B') blackFirst++;
                } else {
                    if (current != 'B') whiteFirst++;
                    if (current != 'W') blackFirst++;
                }
            }
        }

        return Math.min(whiteFirst, blackFirst);
    }
}
