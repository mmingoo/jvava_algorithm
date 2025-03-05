package 이코테.구현;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 숫자 정렬
public class gh4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        ArrayList<String> result = new ArrayList<>();
        int value = 0;

        // 문자를 하나씩 확인하며
        for (int i = 0; i < data.length(); i++) {
            char x = data.charAt(i);

            // 알파벳인 경우 결과 리스트에 삽입
            if (Character.isAlphabetic(x)) {
                result.add(String.valueOf(x));
            }
            // 숫자는 따로 더하기
            else if (Character.isDigit(x)) {
                value += Character.getNumericValue(x);
            }
        }

        // 알파벳을 오름차순으로 정렬
        Collections.sort(result);

        // 숫자가 하나라도 존재하는 경우 가장 뒤에 삽입
        if (value != 0) {
            result.add(String.valueOf(value));
        }

        // 최종 결과 출력(리스트를 문자열로 변환하여 출력)
        System.out.println(String.join("", result));

        scanner.close();
    }
}