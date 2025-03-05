package 수학;

import java.io.*;
import java.io.IOException;

public class b2518 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int min = -1;
        int sum = 0;

        for(int i = num1; i <= num2; i++) {
            if(i < 2) continue;  // 1은 소수가 아님

            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // 소수 판별이 완료된 후에 처리
            if (isPrime) {
                sum += i;

                if(min == -1) {
                    min = i;
                }
            }
        }

        if(min == -1) {  // 소수가 없는 경우
            bw.write("-1");
        } else {
            bw.write(String.valueOf(sum) + "\n");
            bw.write(String.valueOf(min));
        }

        bw.flush();

    }
}