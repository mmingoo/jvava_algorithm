package queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class s4_2164{
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     int n = Integer.parseInt(br.readLine());
     Queue<Integer> q = new LinkedList<>();

     for(int i = 1; i<n+1; i++){
         q.offer(i);
     }

     while(q.size()>1){
         q.poll();
         q.offer(q.poll());
     }

     System.out.print(q.peek());

    }


}
