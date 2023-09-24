package practice.from2000to2999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No2587 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list = list.stream().sorted().collect(Collectors.toList());

        int avg = (int) list.stream().mapToInt(Integer::intValue).average().orElseThrow();
        int mid = list.get(2);

        bw.write(String.format("%d\n%d", avg, mid));

        bw.flush();
        bw.close();
        br.close();
    }
}
