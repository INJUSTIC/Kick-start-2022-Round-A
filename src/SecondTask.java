import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        solve();
    }
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++)
        {
            String[] str = br.readLine().split(" ");
            int meters = Integer.parseInt(str[0]);
            int rad = Integer.parseInt(str[1]);
            int count = Integer.parseInt(str[2]);
            String[] str1 = br.readLine().split(" ");
            int[] locations = new int[str1.length];
            for(int j = 0; j < count; j++)
            {
                locations[j] = Integer.parseInt(str1[j]);
            }
            int res = 0;
            int lastLightedMeter = -1;
            boolean isImpossible = false;
            for(int j = 0; j < locations.length && lastLightedMeter < meters - 1; j++)
            {
                if(locations[j] - rad - 1 > lastLightedMeter) {
                    isImpossible = true;
                    break;
                }
                for (; locations[j] + rad - 1 < meters - 1 && j + 1 < locations.length && locations[j + 1] - rad - 1 <= lastLightedMeter; j++);
                res++;
                lastLightedMeter = locations[j] + rad - 1;
            }
            System.out.print("Case #" + (i + 1) + ": ");
            if (isImpossible || lastLightedMeter < meters - 1) System.out.println("IMPOSSIBLE");
            else System.out.println(res);
        }
    }
}
