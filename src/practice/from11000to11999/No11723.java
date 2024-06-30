package practice.from11000to11999;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No11723 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            String s = input[0];
            switch(s) {
                case "add": {
                    int num = Integer.parseInt(input[1]);
                    set.add(num);
                    break;
                }
                case "remove": {
                    {
                        int num = Integer.parseInt(input[1]);
                        set.remove(num);
                        break;
                    }
                }
                case "check": {
                    int num = Integer.parseInt(input[1]);
                    if(set.contains(num)) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                }
                case "toggle": {
                    int num = Integer.parseInt(input[1]);
                    if(set.contains(num)) set.remove(num);
                    else set.add(num);
                    break;
                }
                case "all": {
                    set = new HashSet<>();
                    for(int ix = 1; ix <= 20; ix++) set.add(ix);
                    break;
                }
                case "empty": {
                    set = new HashSet<>();
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
