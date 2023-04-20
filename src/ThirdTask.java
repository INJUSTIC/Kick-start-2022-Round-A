import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ThirdTask {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++)
        {
            int count = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] foundNumb = new int[count];
            HashSet<Integer> foundNumbSet = new HashSet<>();
            boolean isPossible = true;
            int index = 0;
            for (int j = 0; j < count; j++)
            {
                int number = Integer.parseInt(str[j]);
                if (foundNumb[Math.max(index - 1, 0)] != number)
                {
                    if (foundNumbSet.contains(number))
                    {
                        isPossible = false;
                        break;
                    }
                    else
                    {
                        foundNumb[index++] = number;
                        foundNumbSet.add(number);
                    }
                }
            }
            System.out.print("Case #" + (i + 1) + ": ");
            if (isPossible)
            {
                for(int j = 0; j <= index - 1; j++)
                {
                    System.out.print(foundNumb[j] + " ");
                }
            }
            else
            {
                System.out.print("IMPOSSIBLE");
            }
            System.out.println();
        }
    }
}
