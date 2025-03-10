package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s4_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cardCnt = Integer.parseInt(br.readLine());
        int[] carArr = new int[cardCnt];
        StringTokenizer st1 = new StringTokenizer(br.readLine());


        int ownCnt = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());


        for (int i = 0; i < cardCnt; i++) {
            carArr[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(carArr);

        for (int i = 0; i < ownCnt; i++) {
            if (binary(carArr, Integer.parseInt(st2.nextToken())) >= 0) {
                sb.append("1").append("\n");
            } else {
                sb.append("0").append("\n");
            }
        }

        System.out.print(sb);

    }

    public static int binary(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(target == arr[mid]){
                return 0;
            }
            else if(target < arr[mid]){
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return -1;
    }
}


