package practice.from10000to10999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;


public class No10845 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
//        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            switch(s[0]) {
                case "push": {
                    queue.offer(Integer.parseInt(s[1]));
                    break;
                }
                case "pop": {
                    if(queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.poll());
                    }
                    sb.append("\n");
                    break;
                }
                case "size": {
                    sb.append(queue.size()).append("\n");
                    break;
                }
                case "empty": {
                    if(queue.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                }
                case "front": {
                    if(queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.peek());
                    }
                    sb.append("\n");
                    break;
                }
                case "back": {
                    if(queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.getLast());
                    }
                    sb.append("\n");
                    break;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
