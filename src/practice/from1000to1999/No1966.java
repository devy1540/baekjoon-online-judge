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
        while(t --> 0) {
            LinkedList<int[]> queue = new LinkedList<>();
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[] priority = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for(int i = 0; i < n; i++) {
                queue.offer(new int[]{i, priority[i]});
            }
            int count = 0;
            while(!queue.isEmpty()) {
                int[] tmp = queue.poll();
                boolean b = true;
                for(int i = 0; i < queue.size(); i++) {
                    if(tmp[1] < queue.get(i)[1]) {
                        queue.offer(tmp);
                        for(int j = 0; j < i; j++) {
                            queue.offer(queue.poll());
                        }
                        b = false;
                        break;
                    }
                }
                if(!b) {
                    continue;
                }
                count++;
                if(tmp[0] == m) {
                    break;
                }
            }
            sb.append(count).append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
