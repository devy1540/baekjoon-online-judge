package practice.from24000to24999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No24313 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int a1 = Integer.parseInt(s[0]);
        int a0 = Integer.parseInt(s[1]);

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if(a1 * n0 + a0 <= c * n0 && a1 <= c) {
            bw.write(String.valueOf(1));
        } else {
            bw.write(String.valueOf(0));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
