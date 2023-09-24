package practice.from2000to2999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No2839 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(true) {
            int i = 1;
            if(n % (5 * i) == 0) {
                cnt += n / (5 * i);
                break;
            } else {
                n -= 3;
                cnt++;
            }
            if(n < 0) {
                cnt = -1;
                break;
            }
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}
