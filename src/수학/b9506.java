package 수학;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class b9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            for (int j = 2; j <= num; j++) {
                if (num == j) {
                    cnt++;
                }

                if (num % j == 0) {
                    break;
                }
            }

        }
        bw.write(String.valueOf(cnt));
    }
}
