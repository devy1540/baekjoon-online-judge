package practice.from10000to10999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class No10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int age = Integer.parseInt(s[0]);
            String name = s[1];

            Person p = new Person(i, age, name);
            list.add(p);
        }

        list = list.stream().sorted((o1, o2) -> {
            if(o1.getAge() == o2.getAge()) {
                return o1.index - o2.index;
            } else {
                return o1.getAge() - o2.getAge();
            }
        }).collect(Collectors.toList());


        for(Person p : list) {
            bw.write(String.format("%d %s\n", p.getAge(), p.getName()));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static class Person {

        private int index;
        private int age;
        private String name;

        public Person(int index, int age, String name) {
            this.index = index;
            this.age = age;
            this.name = name;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getIndex() {
            return this.index;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }
}
