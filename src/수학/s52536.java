package 수학;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.util.*;

public class s52536 {
    public static void main(String[] args) throws IOException {
        boolean[][] maps = new boolean[101][101];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y+10 ; k++) {
                    if(!maps[j][k]){
                        maps[j][k] = true;
                        sum++;
                    }
                }
            }
        }
        System.out.print(sum);
    }
}

