package practice.from1000to1999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No1436 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int devilNum = 666;

        int cnt = 0;
        while(true) {
            if(String.valueOf(devilNum).contains("666")) {
                cnt++;
                if(cnt == n) {
                    bw.write(String.valueOf(devilNum));
                    break;
                }
            }
            devilNum++;
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
