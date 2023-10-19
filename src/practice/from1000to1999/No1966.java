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
//        for(int i = 0; i < t; i++) {
        while(t --> 0) {
            Queue<int[]> list = new LinkedList<>();
            String[] s = br.readLine().split(" ");
            //문서의 갯수
            int n = Integer.parseInt(s[0]);

            //구하고자 하는 문서의 번호가 몇번째 queue에 있는지(위치)
            int m = Integer.parseInt(s[1]);

            //문서 중요도
            int[] priority = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            //리스트에 문서 저장
            for(int j = 0; j < n; j++) {
                list.offer(new int[]{j, priority[j]});
            }


            //출력횟수
            int count = 0;

            while(!list.isEmpty()) {
                int[] front = list.poll();
                boolean b = true;

                for(int i = 0; i < list.size(); i++) {
                    if(front[1] < list.peek()[1]) {
                        list.offer(front);

                        for(int j = 0; j < i; j++) {
                            list.offer(list.poll());
                        }

                        b = false;
                        break;
                    }
                }

                if(!b) {
                    continue;
                }

                count++;
                if(front[0] == m) {
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
