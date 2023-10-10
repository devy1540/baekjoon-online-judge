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
            Queue<int[]> queue = new LinkedList<>();
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[] priority = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for(int j = 0; j < n; j++) {
                queue.add(new int[]{j, priority[j]});
            }
            int result = 0;

            while(true) {
                int[] tmp = queue.poll();
                if(queue.stream().anyMatch(il -> tmp[1] <= il[1])) {
                    queue.offer(tmp);
                    int[] tmp2 = queue.stream().filter(il -> tmp[1] <= il[1]).findFirst().orElseThrow();
                    if(tmp2[0] == m) {
                        sb.append(result);
                        break;
                    } else {
                        queue.remove(tmp2);
                        result++;
                    }
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
