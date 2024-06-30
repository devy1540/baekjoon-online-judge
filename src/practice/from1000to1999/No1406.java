package practice.from1000to1999;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class No1406 {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = str.length();

        int m = Integer.parseInt(br.readLine());

        //커서는 총 길이 + 1 --> 인덱스로 표현하자 str이 abc 면 0a1b2c3
        int cursor = n + 1;
        List<String> list = Arrays.stream(str.split("")).collect(Collectors.toList());
        for(int i = 0; i < m; i++) {
            String in = br.readLine();
            if(in.startsWith("P")) list.add(cursor++, in.split(" ")[1]);
            if(in.startsWith("L")) {
                if(cursor > 0) cursor--;
            }
            if(in.startsWith("D")) {
                if(cursor < n + 1) cursor++;
            }
            if(in.startsWith("B")) {
                if(cursor > 0) {
                    list.remove(cursor - 1);
                }
            }
        }

        for(String s : list) bw.write(s);

        bw.flush();
        bw.close();
        br.close();
    }

}
