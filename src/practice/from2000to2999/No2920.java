package practice.from2000to2999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No2920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ilist = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[ilist.length - 1];

        if(ilist[0] == 1 || ilist[0] == 8) {
            for(int i = 0; i < ilist.length - 1; i++) {
                result[i] = ilist[i + 1] - ilist[i];
            }

            if(Arrays.stream(result).allMatch(v -> v == 1)) {
                bw.write("ascending");
            } else if(Arrays.stream(result).allMatch(v -> v == -1)) {
                bw.write("descending");
            } else {
                bw.write("mixed");
            }


        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
