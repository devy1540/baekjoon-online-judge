package practice.from18000to18999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No18870 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rank = 0;

        int n = Integer.parseInt(br.readLine());
        List<Long> origin = Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .boxed()
                .collect(Collectors.toList());

        List<Long> sorted = new ArrayList<>(origin).stream().sorted().distinct().collect(Collectors.toList());

        Map<Long, Integer> map = new HashMap<>();

        for(long x : sorted) {
            if(map.containsKey(x)) {
                map.put(x, rank);
            } else {
                map.put(x, rank++);
            }
        }

        for(long x : origin) {
            bw.write(String.format("%d ", map.get(x)));
        }


        bw.flush();
        bw.close();
        br.close();
    }
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        List<Long> origin = Arrays.stream(br.readLine().split(" "))
//                .mapToLong(Long::parseLong)
//                .boxed()
//                .collect(Collectors.toList());
//
//        List<Long> arr = new ArrayList<>(origin).stream().sorted().distinct().collect(Collectors.toList());
//
//        for(long i : origin) {
//            sb.append(String.format("%d ", arr.indexOf(i)));
//        }
//
//        bw.write(sb.toString());
//
//        bw.flush();
//        bw.close();
//        br.close();
//    }
}
