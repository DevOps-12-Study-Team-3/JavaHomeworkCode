package study;

public class Main {
	public static void main(String[] args) 
    {
		/*
			[문제 설명]
			
			양의 정수 n이 매개변수로 주어질 때, 
			n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
			n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 
			
			return 하는 solution 함수를 작성해 주세요.
			
			[예제 1번]의 n은 7로 홀수입니다. 
			7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 
			이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.
			
			[예제 2번]의 n은 10으로 짝수입니다. 
			10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 
			이들의 제곱의 합인 22 + 42 + 62 + 82 + 102 = 4 + 16 + 36 + 64 + 100 = 220을 
			return 합니다.
		 */
		

        // 데이터
        int Data_list[] = {7, 10};
        
        for ( int n : Data_list ) 	
        {
            System.out.println("n: " + n + ", result: " + solution(n) );
        }       
  
    }
	
    public static int solution(int n) 
    {
        int answer = 0;
        
        if ( n %2 == 0 )
        {
            System.out.println( "짝수 입니다." );
            
            // n까지의 짝수구하기
            for (int i = 2 ; i <= n ; i += 2) // n까지의 짝수
            {
                answer += i * i;
            }            
        }
        else
        {
        	System.out.println( "홀수 입니다." );
        	
            // n까지의 홀수 구하기
            for ( int i = 1; i <= n ; i += 2 )  // n까지 홀수
            {
                answer += i;
            }        	
 
        }
        
        return answer;
    }	
	
	
	
}


    
    
