package stack;

import java.io.*;
import java.util.*;
public class s4_28278 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int number = 0;
            if(num == 1 && st.hasMoreTokens()){
                number = Integer.parseInt(st.nextToken());
            }

            switch(num){
                case 1:
                    stack.push(number);
                    break;  // break 문 추가
                case 2:
                    if(!stack.isEmpty()){
                        sb.append(stack.pop()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;  // break 문 추가
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;  // break 문 추가
                case 4:
                    if(stack.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;  // break 문 추가
                case 5:
                    if(!stack.isEmpty()){
                        sb.append(stack.peek()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;  // break 문 추가
            }
        }

        System.out.print(sb.toString());

    }
}