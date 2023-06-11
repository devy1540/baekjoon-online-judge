package practice.from5000to5999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No5073 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine();
            if(s.equalsIgnoreCase("0 0 0")) break;

            Integer[] nlist = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
            Arrays.sort(nlist, Collections.reverseOrder());

            int count = Arrays.stream(nlist).distinct().toArray().length;
            if(count == 1) {
                bw.write("Equilateral\n");
            } else {
                int max = nlist[0];
                int sumWithoutMax = nlist[1] + nlist[2];

                if(max < sumWithoutMax) {
                    if(count == 2) {
                        bw.write("Isosceles\n");
                    } else {
                        bw.write("Scalene\n");
                    }
                } else {
                    bw.write("Invalid\n");
                }
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
