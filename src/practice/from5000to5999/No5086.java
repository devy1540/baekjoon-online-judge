package practice.from5000to5999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No5086 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int[] nlist = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(Arrays.stream(nlist).allMatch(n -> n == 0)) {
                break;
            } else {
                int first = nlist[0];
                int second = nlist[1];

                if(first % second == 0) {
                    bw.write("multiple\n");
                } else if(second % first == 0) {
                    bw.write("factor\n");
                } else {
                    bw.write("neither\n");
                }
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
