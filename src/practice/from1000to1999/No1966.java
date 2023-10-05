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
            Deque<List<Integer>> queue = new ArrayDeque<>();
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[] priority = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for(int j = 0; j < n; j++) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(j);
                tmp.add(priority[j]);

                queue.add(tmp);
            }
            int result = 1;
            all:
            while(true) {
                List<Integer> tmp = queue.peekFirst();
                if(queue.isEmpty()) {
                    sb.append(result);
                    break;
                } else {
                    for(List<Integer> e : queue) {
                        if(tmp.get(1) <= e.get(1)) {
                            queue.addLast(tmp);
                        } else {
                            if(tmp.get(0) != m) {
                                result++;
                            } else {
                                sb.append(result);
                                break all;
                            }
                        }
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
