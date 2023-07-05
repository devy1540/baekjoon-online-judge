package practice.from2000to2999;
import java.util.*;
import java.io.*;
import java.util.stream.*;
import java.math.*;

public class No2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 1; i < n; i++) {
            int tmp = i;
            int sum = 0;

            while(tmp != 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if(i + sum == n) {
                result = i;
                break;
            }
        }


        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
