package practice.from30000to30999;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class No30802 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] sizeArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String s = br.readLine();
        int t = Integer.parseInt(s.split(" ")[0]);
        int p = Integer.parseInt(s.split(" ")[1]);

        int tResult = 0;

        for(int i : sizeArr) {
            if(i > 0) {
                int divide = i / t;
                int mod = i % t;
                tResult += divide;
                if(mod != 0) tResult++;
            }
        }

        int pDivide = n / p;
        int pMod = n % p;


        bw.write(tResult + "\n");
        bw.write(String.format("%s %s", pDivide, pMod));

        bw.flush();
        bw.close();
        br.close();

    }
}
