package 이코테.그리디;

import java.util.Scanner;

public class greedy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int now = str.charAt(0) - '0';

        for (int i = 1; i<str.length(); i++ )
            if(str.charAt(i) - '0' == 0 || str.charAt(i) - '0' == 1)
                now += str.charAt(i) - '0';
            else
                now *= str.charAt(i) - '0';

        System.out.println(now);

    }
}
