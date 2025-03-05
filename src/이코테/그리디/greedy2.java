package 이코테.그리디;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class greedy2 {
    public static  ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i<n; i++)
            arrayList.add(sc.nextInt());

        Collections.sort(arrayList);

        int result = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            count += 1;
            if(count >= arrayList.get(i)){
                result += 1;
                count = 0;
            }
        }
        System.out.println(result);
    }
}
