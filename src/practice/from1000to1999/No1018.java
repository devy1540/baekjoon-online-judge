package practice.from1000to1999;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class No1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력 값
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int min = Integer.MAX_VALUE;
        String[][] arr = new String[n][m];
        for(int i = 0; i < n; i++) {
            s = br.readLine().split("");
            System.arraycopy(s, 0, arr[i], 0, m);
        }




        for(int i = 0; i <= n - 8; i++) {
            for(int j = 0; j <= m - 8; j++) {
                String c = "B";
                int count = 0;

                //비교 B
                for(int x = i; x < 8 + i; x++) {
                    for(int y = j; y < 8 + j; y++) {
                        if(!arr[x][y].equalsIgnoreCase(c)) {
                            count++;
                        }
                        if(c.equalsIgnoreCase("W")) {
                            c = "B";
                        } else {
                            c = "W";
                        }
                    }
                    if(c.equalsIgnoreCase("W")) {
                        c = "B";
                    } else {
                        c = "W";
                    }
                }
                min = Math.min(min, count);

                c = "W";
                count = 0;

                //비교 W
                for(int x = i; x < 8 + i; x++) {
                    for(int y = j; y < 8 + j; y++) {
                        if(!arr[x][y].equalsIgnoreCase(c)) {
                            count++;
                        }
                        if(c.equalsIgnoreCase("W")) {
                            c = "B";
                        } else {
                            c = "W";
                        }
                    }
                    if(c.equalsIgnoreCase("W")) {
                        c = "B";
                    } else {
                        c = "W";
                    }
                }
                min = Math.min(min, count);
            }
        }

        bw.write(String.valueOf(min));

        bw.flush();
        bw.close();
        br.close();
    }
}
