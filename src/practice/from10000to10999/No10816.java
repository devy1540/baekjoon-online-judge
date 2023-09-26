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
        StringBuilder sb = new StringBuilder();

        Map<Long, Integer> map = Arrays.stream(br.readLine().split(" "))
                        .mapToLong(Long::parseLong)
                        .boxed()
                        .collect(Collectors.toMap(k -> k, v -> 0, (e1, e2) -> e1, LinkedHashMap::new));

        for(long l : list1) {
            if(map.containsKey(l)) {
                int tmp = map.get(l);
                map.put(l, tmp + 1);
            }
        }

        map.forEach((aLong, integer) -> sb.append(integer).append(" "));

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
