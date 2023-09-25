package practice.from10000to10999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No10815 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toMap(k -> k, v -> 0, (b, a) -> b, LinkedHashMap::new));

        for(int i : arr) {
            if(map.containsKey(i)) {
                map.put(i, 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        map.forEach((k, v) -> sb.append(v).append(" "));

        bw.write(sb.toString());


        bw.flush();
        bw.close();
        br.close();
    }
}
