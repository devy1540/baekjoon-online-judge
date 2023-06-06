package practice.from2000to2999;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class No2566 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 9; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            List<Integer> tmp = Arrays.stream(input).boxed().collect(Collectors.toList());

            list.add(tmp);
        }

        int max = list.stream().flatMap(Collection::stream).mapToInt(Integer::intValue).max().orElseThrow();

        bw.write(max + "\n");
        for(int i = 0; i < 9; i++) {
            if(list.get(i).contains(max)) {
                int x = i + 1;
                int y = list.get(i).indexOf(max) + 1;
                bw.write(x + " " + y);
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
