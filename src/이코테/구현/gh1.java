package 이코테.구현;
import java.util.Scanner;
public class gh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        String[] plans = sc.nextLine().split(" ");
        int x = 1, y = 1;
        // 상,하,좌,우
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] maps = {'L', 'R', 'U', 'D'};

        for (int i = 0; i < plans.length; i++) {
            char c = plans[i].charAt(0);
            int nx = -1;
            int ny = -1;

            for (int j = 0; j < 4; j++) {
                if (c == maps[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];

                }
            }

            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);

    }
}
