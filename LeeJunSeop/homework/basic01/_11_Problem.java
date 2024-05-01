package homework.basic01;

public class _11_Problem {
	public static void main(String[] args){
//		11. int 배열로 10개의 공간을 생성하세요.
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하세요.
		
		int[] randIntArr = new int[10];
		
		for(int i = 0; i < randIntArr.length; ++i) {
			randIntArr[i] = (int)(Math.random() * 10) + 1;
			if(randIntArr[i] % 2 == 1) 
				System.out.println("randIntArr["+i+"] 의 값은 홀수이며 그 값은 "+randIntArr[i]+"이다");
		}
	}

}
