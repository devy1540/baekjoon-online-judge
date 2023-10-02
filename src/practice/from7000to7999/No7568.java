package practice.from7000to7999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No7568 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n  = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            Person p = new Person(Integer.parseInt(s[0]),  Integer.parseInt(s[1]));
            list.add(p);
        }

        System.out.println(list);

        list = list.stream().sorted((o1, o2) -> o2.weight - o1.weight).collect(Collectors.toList());

        System.out.println(list);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        bw.close();
    }
    public static class Person {
        int weight;

        int height;


        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        @Override
        public String toString() {
            return new StringBuilder()
                    .append("{")
                    .append("w: ")
                    .append(weight)
                    .append(", ")
                    .append("h: ")
                    .append(height)
                    .append("}")
                    .toString();
        }
    }
}
