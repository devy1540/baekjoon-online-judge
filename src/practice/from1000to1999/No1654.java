package practice.from1000to1999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No1654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        // 랜선 갯수
        int k = Integer.parseInt(s[0]);
        // 필요한 랜선의 갯수
        int n = Integer.parseInt(s[1]);

        int[] arr = new int[k];

        for(int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        long min = 1;
        long max = arr[arr.length - 1];
        long result = 0;

        while(min <= max) {
            long mid = (min + max) / 2;
            long count = Arrays.stream(arr).map(x -> x / (int) mid).sum();

            if(count >= n) {
                result = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }


        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
