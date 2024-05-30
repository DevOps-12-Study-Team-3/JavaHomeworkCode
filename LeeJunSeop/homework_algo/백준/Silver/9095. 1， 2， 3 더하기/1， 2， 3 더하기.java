import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dp = new int[11 + 1];
		int testCase = Integer.valueOf(br.readLine());
		int[] nVals = new int[testCase];
		for(int i = 0; i < testCase; ++i) {
			nVals[i] = Integer.parseInt(br.readLine());
		}
		// dp
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 4; i <= 11; ++i) {
			dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
		}
		
		for(int i = 0; i < testCase ; ++i) {
			System.out.println(dp[nVals[i]]);
		}
		
	}
}