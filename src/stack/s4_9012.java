package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class s4_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            boolean possible = true;
            char[] sArr = br.readLine().toCharArray();

            for(int j = 0; j < sArr.length; j++) {
                if (sArr[j] == '(') {
                    stack.push('(');
                } else {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        possible = false;
                        break;  // 이미 불가능한 경우 반복문 종료
                    }
                }
            }

            if(!stack.isEmpty()) {
                possible = false;
            }

            if(possible) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);

    }
}