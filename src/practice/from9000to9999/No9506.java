package practice.from9000to9999;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class No9506 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            List<Integer> divisorList = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            if(n == -1) break;

            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    divisorList.add(i);
                }
            }
            int sum = divisorList.stream().mapToInt(v -> v).sum();
            if(sum == n) {
                bw.write(String.format("%s = ", n));
                for(int i = 0; i < divisorList.size(); i++) {
                    if(i == divisorList.size() - 1) {
                        bw.write(String.valueOf(divisorList.get(i)));
                    } else {
                        bw.write(String.format("%s + ", divisorList.get(i)));
                    }
                }
                bw.write("\n");
            } else {
                bw.write(String.format("%s is NOT perfect.\n", n));
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
