package practice.from3000to3999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class No3009 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] xlist = new int[3];
        int[] ylist = new int[3];

        for(int i = 0; i < 3; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            xlist[i] = input[0];
            ylist[i] = input[1];
        }

        if(xlist[0] == xlist[1]) {
            bw.write(String.format("%s ", xlist[2]));
        } else {
            bw.write(String.format("%s ", (xlist[0] == xlist[2])?(xlist[1]):(xlist[0])));
        }

        if(ylist[0] == ylist[1]) {
            bw.write(String.format("%s", ylist[2]));
        } else {
            bw.write(String.format("%s", (ylist[0] == ylist[2])?(ylist[1]):(ylist[0])));
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
