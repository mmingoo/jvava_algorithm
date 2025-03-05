package 이코테.구현;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//체스 문제
public class gh3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        int [] maps = new int [2];
        int nx = -1, ny = -1;
        maps[0] = ch.charAt(0) -'a' + 1;  // 알파벳 a를 1로 변환
        maps[1] = ch.charAt(1) - '0';      // 문자 숫자를 정수로 변환
        int result = 0;

        // 지도 상하좌우
        int [] dx = {-2, -2, 2, 2, -1, -1 , 1, 1};
        int [] dy = {-1, 1, -1, 1, 2, -2 , -2, 2};

        for(int i = 0; i<dx.length; i++){
            nx = dx[i] + maps[1];
            ny = dy[i] + maps[0];

            if( 0<nx && nx <=8 && 0<ny&& ny<=8)
                result++;
        }
        System.out.println(result);
    }
}
