import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] structure = new int[n];
        int[] data = new int[n];



        // 자료구조 내용 저장
        for(int i = 0; i < n; i++){
            structure[i] = Integer.parseInt(st.nextToken());
        }

        // 자료구조별 데이터 저장 내용
        for(int i = 0; i < n; i++){
            data[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입할 원소 개수
        int addCount = Integer.parseInt(br.readLine());

        // 삽입할 원소 입력
        StringTokenizer addData = new StringTokenizer(br.readLine());
        int[] addDataArr = new int[addCount];


        // 삽입할 원소 배열 생성
        for(int i = 0; i<addCount; i++){
            addDataArr[i] = Integer.parseInt(addData.nextToken());
        }
    }
}



