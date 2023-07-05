package practice.from19000to19999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No19532 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ilist = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = ilist[0];
        int b = ilist[1];
        int c = ilist[2];
        int d = ilist[3];
        int e = ilist[4];
        int f = ilist[5];

        for(int x = -999; x < 1000; x++) {
            for(int y = -999; y < 1000; y++) {
                int ax = a * x;
                int by = b * y;
                int dx = d * x;
                int ey = e * y;

                if(ax + by == c && dx + ey == f) {
                    bw.write(String.format("%s %s", x, y));
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
