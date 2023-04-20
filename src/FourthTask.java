import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourthTask {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++)
        {
            long letterNumb = Long.parseLong(br.readLine());
            int iterNumb = 1;
            for(int j = 26; letterNumb - j > 0; iterNumb++, j+=26)
            {
                letterNumb -= j;
            }
            char letter = (char) (letterNumb/iterNumb + (letterNumb % iterNumb == 0 ? 0 : 1) + 64);
            System.out.println("Case #" + (i + 1) + ": " + letter);
        }
    }
}
