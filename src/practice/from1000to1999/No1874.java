package practice.from1000to1999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No1874 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int index = 0;

        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int i = 1;


        while(index < n) {
            if(stack.isEmpty() || !list.get(index).equals(stack.peek())) {
                stack.push(i++);
                sb.append("+").append("\n");
                if(stack.size() > n) {
                    sb = new StringBuilder("NO");
                    break;
                }
            } else {
                stack.pop();
                sb.append("-").append("\n");
                index++;
            }
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

//[push, push, push, push, pop, pop, push, push, pop, push, push, pop, pop, pop, pop, pop]

// 4 3 7 2 1
// 8 6 5 1 2 7 3 4