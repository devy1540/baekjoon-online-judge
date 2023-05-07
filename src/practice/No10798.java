package practice;

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No10798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] list = new String[5][15];
        //input data
        for (int i = 0; i < 5; i++) {
            String[] s = br.readLine().split("");
            String[] tmp = Arrays.copyOf(s, 15);
            list[i] = tmp;
        }

        //process
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(Objects.nonNull(list[j][i])) {
                    bw.write(list[j][i]);
                }
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
