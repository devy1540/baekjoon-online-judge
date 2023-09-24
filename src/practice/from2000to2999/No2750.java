package practice.from2000to2999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No2750 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list = list.stream().sorted().collect(Collectors.toList());

        for(int i : list) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
