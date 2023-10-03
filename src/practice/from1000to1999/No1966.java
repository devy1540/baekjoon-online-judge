package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            PriorityQueue<Map<Integer, Integer>> queue = new PriorityQueue<>();
            String[] s = br.readLine().split(" ");
            //문서의 갯수
            int n = Integer.parseInt(s[0]);
            // Queue순서
            int m = Integer.parseInt(s[1]);
            int[] priority = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();




        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
