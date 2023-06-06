package practice.from2000to2999;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class No2292 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int distance = 1;
        int range = 1;

        while(range < n) {
            range += (6 * distance);
            distance++;
        }
        bw.write(String.valueOf(distance));

        bw.flush();
        bw.close();
        br.close();
    }
}
