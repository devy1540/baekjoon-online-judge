package practice.from2000to2999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No2501 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int c = 0;
        boolean flag = false;

        for(int i = 1; i <= n; i++) {
            //나머지가 0이면 약수
            if(n % i == 0) {
                c++;
                if(c == k) {
                    flag = true;
                    c = i;
                    break;
                }
            }
        }

        bw.write(String.valueOf((flag)?(c):(0)));

        bw.flush();
        bw.close();
        br.close();
    }
}
