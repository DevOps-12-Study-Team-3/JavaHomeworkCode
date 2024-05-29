
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int vinylCnt = 0;
		int kg = 0;
		try {
			kg = Integer.valueOf(br.readLine());
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
		while(true) {
			if(kg % 5 == 0) {
				vinylCnt += kg / 5;
				break;
			}else if(kg > 0) {
				vinylCnt += 1;
				kg -= 3;
			}else {
				vinylCnt = -1;
				break;
			}
		}
		System.out.println(vinylCnt);
		
		try {
			br.close();
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}
	
}
