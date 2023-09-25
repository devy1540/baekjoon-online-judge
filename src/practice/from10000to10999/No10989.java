package practice.from10000to10999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] list = new int[n];

        for(int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        for(int x : list) {
            bw.write(x + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
