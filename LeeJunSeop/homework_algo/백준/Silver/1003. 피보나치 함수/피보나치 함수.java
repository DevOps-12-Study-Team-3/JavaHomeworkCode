
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		final int N = 40;
		int testCnt;
		int[] dp0 = new int[N + 1];
		int[] dp1 = new int[N + 1];
		
		// dp0
		dp0[0] = 1;
		dp0[1] = 0;
		dp0[2] = 1;
		for(int n = 3; n <= N; ++n) {
			dp0[n] = dp0[n-1] + dp0[n-2];
		}
		
		// dp1
		dp1[0] = 0;
		dp1[1] = 1;
		dp1[2] = 1;

		for(int n = 3; n <= N; ++n) {
			dp1[n] = dp1[n-1] + dp1[n-2];
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		testCnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCnt; ++i) {
			int caseNum = Integer.parseInt(br.readLine());
			System.out.println(dp0[caseNum] + " " + dp1[caseNum]);
		}
		
		br.close();
		
	}
}
