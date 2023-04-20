import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int[] codes = new int[26];
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 26; j++) {
                codes[j] = Integer.parseInt(str[j]);
            }
            int count = Integer.parseInt(br.readLine());
            String[] words = new String[count];
            for (int j = 0; j < count; j++) {
                words[j] = br.readLine();
            }
            HashSet<List<Integer>> codedStr = new HashSet<>();
            for (int j = 0; j < count; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = 0; k < words[j].length(); k++) {
                    list.add(codes[words[j].charAt(k) - 65]);
                }
                codedStr.add(list);
            }
            if (i == N - 1) {
                if (codedStr.size() != count) System.out.print("Case #" + (i + 1) + ": YES");
                else System.out.print("Case #" + (i + 1) + ": NO");
            } else {
                if (codedStr.size() != count) System.out.println("Case #" + (i + 1) + ": YES");
                else System.out.println("Case #" + (i + 1) + ": NO");
            }
        }
    }
}
