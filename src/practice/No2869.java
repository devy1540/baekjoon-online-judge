package practice;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No2869 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        int day = 0;
        int distance = 0;

        while(distance < v) {
            distance = distance + a - b;
            day++;
        }


        bw.write(String.valueOf(day));

        bw.flush();
        bw.close();
        br.close();
    }
}
