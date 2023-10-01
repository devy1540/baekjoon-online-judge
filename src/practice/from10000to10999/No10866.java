package practice.from10000to10999;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
public class No10866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deck = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            switch(s[0]) {
                case "push_front": {
                    deck.addFirst(Integer.parseInt(s[1]));
                    break;
                }
                case "push_back": {
                    deck.addLast(Integer.parseInt(s[1]));
                    break;
                }
                case "pop_front": {
                    if(deck.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deck.pollFirst());
                    }
                    sb.append("\n");
                    break;
                }
                case "pop_back": {
                    if(deck.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deck.pollLast());
                    }
                    sb.append("\n");
                    break;
                }
                case "size": {
                    sb.append(deck.size()).append("\n");
                    break;
                }
                case "empty": {
                    if(deck.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                }
                case "front": {
                    if(deck.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deck.getFirst());
                    }
                    sb.append("\n");
                    break;
                }
                case "back": {
                    if(deck.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deck.getLast());
                    }
                    sb.append("\n");
                    break;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
