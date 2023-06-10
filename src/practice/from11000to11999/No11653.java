package practice.from11000to11999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No11653 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while(n > 1) {
            for(int i = 2; i <= n; i++) {
                if(n % i == 0) {
                    bw.write(String.format("%s\n", i));
                    n /= i;
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
