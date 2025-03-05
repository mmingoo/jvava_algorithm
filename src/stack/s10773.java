package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class s10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            if(a == 0){
                stack.pop();
            }else{
                stack.push(a);
            }
        }

        for(int num : stack) {
            sum += num;
        }
        System.out.println(sum);
    }
}
