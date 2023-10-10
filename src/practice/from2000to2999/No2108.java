package practice.from2000to2999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;


public class No2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        sb.append(getAverage(arr)).append("\n");
        sb.append(getMid(arr)).append("\n");
        sb.append(getFreq(arr)).append("\n");
        sb.append(getRange(arr)).append("\n");


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static long getAverage(int[] list) {
        return Math.round(Arrays.stream(list).average().orElseThrow());
    }

    public static long getMid(int[] list) {
        Arrays.sort(list);
        int midIndex = (list.length / 2);
        return list[midIndex];
    }

    public static long getFreq(int[] list) {
        Map<Integer, Integer> map = Arrays.stream(list).boxed().collect(Collectors.toMap(k -> k, v -> 0, (o, n) -> o));

        for(int i : list) {
            int value = map.get(i);
            map.put(i, value + 1);
        }

        int maxFreqVal = map.values().stream().mapToInt(Integer::intValue).max().orElseThrow();

        if(map.values().stream().mapToInt(Integer::intValue).filter(i -> i == maxFreqVal).count() > 1) {
            return map.entrySet().stream().filter(e -> e.getValue() == maxFreqVal).map(Map.Entry::getKey).sorted().collect(Collectors.toList()).get(1);
        } else {
            return map.entrySet().stream().filter(e -> e.getValue() == maxFreqVal).map(Map.Entry::getKey).findFirst().orElseThrow();
        }
    }

    public static long getRange(int[] list) {
        int max = Arrays.stream(list).max().orElseThrow();
        int min = Arrays.stream(list).min().orElseThrow();

        return max - min;
    }
}
