package practice.from10000to10999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No10816 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] list1 = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int m = Integer.parseInt(br.readLine());
        long[] list2 = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        Map<Long, Integer> map = Arrays.stream(list2)
                        .boxed()
                        .collect(Collectors.toMap(k -> k, v -> 0, (b, a) -> b, LinkedHashMap::new));

        StringBuilder sb = new StringBuilder();

        for(long key : list1) {
            map.computeIfPresent(key, (l, i) -> i + 1);
        }

        for(long l : list2) {
            sb.append(map.get(l)).append(" ");
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}
