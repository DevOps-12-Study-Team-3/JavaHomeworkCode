package homework.middle01;

public class _03_Problem {

	public static void main(String[] args) {
//		3. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요.
		
		int idx = 0;
		while(idx++ <= 10) {
			if(idx % 2 == 0)
				System.out.println(idx);
		}
	}

}
