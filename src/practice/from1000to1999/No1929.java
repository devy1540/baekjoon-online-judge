package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No1929 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] ilist = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[ilist[1] + 1];

        result[0] = result[1] = -1;

        for(int i = 2; i <= Math.sqrt(ilist[1]); i++) {
            if(result[i] == 0) {
                for(int j = i * i; j <= ilist[1]; j += i) {
                    result[j] = -1;
                }
            }
        }

        for(int i = ilist[0]; i <= ilist[1]; i++) {
            if(result[i] == 0) {
                sb.append(i).append("\n");
            }
        }



        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
