package practice;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No2745 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String b = input[0];
        int n = Integer.parseInt(input[1]);

        bw.write(String.valueOf(Integer.parseInt(b, n)));
        change(b, n);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void change(String b, int n) {
        long result = 0;
        long radix = 0;
        // 일의 자리부터 i 자리까지
        // 숫자는 48
        // 대문자는 55
        // 소문자는 87
        for(int i = b.length() - 1; i >= 0; i--) {
            // 숫자 0~9 까지
            char c = b.charAt(i);
            if('0' <= c && c <= '9') {
                result += (c - 48) * Math.pow(n, radix++);
            // 이외(A~Z)까지
            } else {
                result += (c - 55) * Math.pow(n, radix++);
            }
        }
        System.out.println(result);

    }
}
