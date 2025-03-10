import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //풍선의 갯수 받기
        int N = Integer.parseInt(br.readLine());

        // 위치 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Balloon> q = new ArrayDeque<>();

        int [] moveLocation = new int[N];
        for(int i =0; i<N; i++){
            moveLocation[i] = Integer.parseInt(st.nextToken());
        }

        // 큐에 1반을 제외한 풍선을 넣기
        for(int i = 1; i<N; i++){
            q.add(new Balloon(i+1,moveLocation[i]));
        }

        //첫번재 풍선 종이
        int moveValue = moveLocation[0];
        sb.append("1 ");


        while(!q.isEmpty()){
            if(moveValue > 0){
                for(int i = 1; i< moveValue;  i++){
                    q.add(q.poll());
                }


                Balloon next = q.poll();
                moveValue = next.location;
                sb.append(next.idx+" ");

            }else{
                for(int i = 1; i< -moveValue;  i++){
                    q.addFirst(q.pollLast());
                }
                Balloon next = q.pollLast();
                moveValue = next.location;
                sb.append(next.idx+" ");

            }
        }

        System.out.print(sb);
    }
}

class Balloon{
    int idx;
    int location;
    public Balloon(int idx, int location){
        this.idx = idx;
        this.location = location;

    }
}

