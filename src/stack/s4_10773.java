package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class s4_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < n; i++){
            int k = Integer.parseInt(br.readLine());

            if(k == 0){
                stack.pop();
            }else{
                stack.push(k);
            }

        }

        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.print(sum);

    }
}