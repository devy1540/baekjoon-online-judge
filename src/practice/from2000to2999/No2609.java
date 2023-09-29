package practice.from2000to2999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No2609 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] i = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int i1 = i[0];
        int i2 = i[1];

        while(true) {
            int r = i1 % i2;
            if(r == 0) {
                sb.append(i2).append("\n");
                sb.append(Arrays.stream(i).reduce(1, (a, b) -> a * b) / i2);
                break;
            } else {
                i1 = i2;
                i2 = r;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
