
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long[] sum = new long[n];
            long[] extra = new long[n];
            boolean[] fixed = new boolean[n];

            long low = Long.MAX_VALUE;
            long cap = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                long c = Long.parseLong(st.nextToken());

                sum[i] = a + b + c;
                fixed[i] = (a == b && b == c);

                if (a <= b && b <= c) {
                    extra[i] = Math.min(b - a, c - b) + 1;
                }

                low = Math.min(low, sum[i]);

                if (fixed[i]) {
                    cap = Math.min(cap, sum[i]);
                }
            }

            long high = Math.min(cap, low + k) + 1;

            while (high - low > 1) {
                long mid = low + (high - low) / 2;
                long needed = 0;
                boolean possible = true;

                for (int i = 0; i < n; i++) {
                    if (sum[i] >= mid) {
                        continue;
                    }

                    if (fixed[i]) {
                        possible = false;
                        break;
                    }

                    needed += (mid - sum[i]) + 2 * extra[i];

                    if (needed > k) {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    low = mid;
                } else {
                    high = mid;
                }
            }

            out.append(low).append('\n');
        }

        System.out.print(out);
    }
}
