package practice.from31000to31999;

import java.util.*;
import java.io.*;
import java.util.stream.*;
import java.math.*;

public class No31403 {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        bw.write((a + b - c) + "\n");
        bw.write(String.valueOf(Integer.parseInt(String.valueOf(a) + b) - c));

        bw.flush();
        bw.close();
        br.close();
    }
}
