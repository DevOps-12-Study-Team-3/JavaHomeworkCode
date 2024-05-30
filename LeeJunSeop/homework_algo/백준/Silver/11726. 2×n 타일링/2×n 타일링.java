
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int N = 1000;
		long[] dp2N = new long[N + 1];
		int inputN = Integer.parseInt(br.readLine());
		
		dp2N[1] = 1;
		dp2N[2] = 2;
		for(int n = 3; n <= N; ++n) {
			dp2N[n] = (dp2N[n-1] + dp2N[n-2]) % 10007;
		}
		System.out.println(dp2N[inputN]);
		
	}
}
