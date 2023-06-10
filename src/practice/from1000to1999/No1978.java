package practice.from1000to1999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;


public class No1978 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int x : list) {
            if(x == 1) continue;
            boolean flag = true;
            for(int i = 2; i < x; i++) {
                if(x % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }
}
