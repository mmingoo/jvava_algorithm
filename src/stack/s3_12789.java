package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class s3_12789 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 1;
        String result = "Nice";

        // 번호표 받는 사람
        int N = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");

        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < N; i++){
            int currNum = Integer.parseInt(sArr[i]);

            if(currNum != idx){
                if(!stack.isEmpty() && stack.peek() == idx){
                    idx ++;
                    i--;
                    stack.pop();
                }else{
                    stack.push(currNum);
                }
            }else{
                idx++;
            }
        }

        while(!stack.isEmpty()){
            int pop = stack.pop();
            if(pop == idx ){
                idx ++;
            }else{
                result = "Sad";
                break;
            }
        }
        System.out.print(result);
    }
}
