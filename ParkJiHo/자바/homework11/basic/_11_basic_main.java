package homework_my.homework11.basic;

public class _11_basic_main {

	public static void main(String[] args) {
		
		// ##############################################################################
		
		// [ 1번문제 ]
		
		// 1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 
		// 1 ~ 20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 
		//각각의 스레드를 실행하십시오.
		
		Thread T1 = new Thread()
		{
			@Override
			public void run()
			{
				for( int i = 1 ; i <= 20 ; i++ )
				{
					if ( ( i %3 == 0 ) && ( i %4 == 0 ) )
					{
						System.out.println( "3과 4의 공배수 : " + i );
					}
					
				}
			}
		} ;
		
		Thread T2 = new Thread()
		{
			@Override
			public void run()
			{
				for( int i = 1 ; i <= 20 ; i++  )
				{
					if( 30 % i == 0  )
					{
						System.out.println( "[" + i + "]는 30의 약수입니다." );  
					}
				}
			}
		} ;
		
		T1.start();
		T2.start();
		
		// ##############################################################################
		
		// [ 2번문제 ]
		
		// 2. 1번 문제에서 join()메소드를 이용해서 
		// 서브 스레드가 먼저 실행되서 끝난 후에 메인 스레드가 실행되도록 구현하세요.
		
		try {
			
			T2.join();
			
		} catch ( InterruptedException ie) {
			
			System.out.println( ie.getMessage() );
			
		}
		
		System.out.println( "==============================" );
		
		// ##############################################################################
		
		// [ 3번문제 ]
		
		// 3. 공유객체로 사용될 클래스 NumberPrinter를 만들고 
		// 멤버변수로 int num을 가지고 정수형 매개변수를 받아 
		// 매개변수로 받아온 값은 num에 저장하고 
		// num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 num~100까지 숫자 중 5와 7의 공배수를 출력하는 
		// 메소드 numPrint2(int num)를 구현하세요. 
		// 그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 두 개의 스레드를 실행하세요.		
		
		NumberPrinter numberPrinter = new NumberPrinter( ) ;
		
		numberPrinter.numPrint1( 10 ) ;
		numberPrinter.numPrint2( 10 ) ;
		
		System.out.println( "==============================" );
		
		// ##############################################################################
		
		// [ 4번문제 ]
		
		// 4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.
		
		NumberPrinter2 numberPrinter2 = new NumberPrinter2( ) ;
		
		Thread t3 = new Thread()
		{
			@Override
			public void run()
			{
				numberPrinter2.numPrint1( 10 ) ;
			}
			
			
		} ;
		
		Thread t4 = new Thread()
		{
			@Override
			public void run()
			{
				numberPrinter2.numPrint2( 10 ) ;
			}
			
			
		} ;
		
		t3.start();		
		t4.start();
		
		System.out.println( "==============================" );
		
		// ##############################################################################
		
		// [ 5번문제 ]
		
		// 5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.
		
		NumberPrinter3 numberPrinter3 = new NumberPrinter3( ) ;
		
		
		Thread t5 = new Thread()
		{
			@Override
			public void run()
			{
				numberPrinter3.numPrint1( 10 ) ;
			}
			
			
		} ;
		
		Thread t6 = new Thread()
		{
			@Override
			public void run()
			{
				numberPrinter3.numPrint2( 10 ) ;
			}
			
			
		} ;
		
		t5.start();
		t6.start();	
		
		
		System.out.println( "==============================" );
		
		
		// ##############################################################################

	}

}
