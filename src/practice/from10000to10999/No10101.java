package practice.from10000to10999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No10101 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] list = new int[3];

        for(int i = 0; i < 3; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        if(Arrays.stream(list).allMatch(v -> v == 60)) {
            bw.write("Equilateral");
        } else if(Arrays.stream(list).sum() == 180) {
            if(Arrays.stream(list).distinct().toArray().length == 2) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
        } else {
            bw.write("Error");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
