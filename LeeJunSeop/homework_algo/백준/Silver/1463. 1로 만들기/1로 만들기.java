
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int N = 1000000;
		int intVal = 0;
		int[] minCntArr = new int[N+1];
		
		try {
			intVal = Integer.valueOf(br.readLine());
		
		}catch(IOException ie) {
			ie.printStackTrace();
		}
			if(intVal >=2) {
				for(int i = 2; i <= intVal; ++i) {
					minCntArr[i] = minCntArr[i-1] + 1;
					
					if(i % 2 == 0) minCntArr[i] = Math.min(minCntArr[i], minCntArr[i/2] + 1);
					if(i % 3 == 0) minCntArr[i] = Math.min(minCntArr[i], minCntArr[i/3] + 1);
				}
			}
			
			System.out.println(minCntArr[intVal]);
		
		
		try {
			br.close();
		
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
	
}
