package practice.from14000to14999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No14215 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer[] nlist = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        Arrays.sort(nlist, Collections.reverseOrder());

        while(nlist[0] >= nlist[1] + nlist[2]) {
            nlist[0]--;
        }

        bw.write(String.valueOf(Arrays.stream(nlist).mapToInt(v -> v).sum()));

        bw.flush();
        bw.close();
        br.close();

    }
}
