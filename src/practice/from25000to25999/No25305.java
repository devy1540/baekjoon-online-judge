package practice.from25000to25999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No25305 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        List<Integer> x = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        bw.write(String.valueOf(x.get(k - 1)));

        bw.flush();
        bw.close();
        br.close();
    }
}
