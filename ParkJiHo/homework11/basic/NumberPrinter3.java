package homework_my.homework11.basic;

public class NumberPrinter3
{
	private int num ;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public synchronized void numPrint1(int num)
	{
		this.setNum( num ) ;
		
		for( int i = this.num ; i <= 50 ; i++ )
		{
			if ( ( i %3 == 0 ) )
			{
				System.out.println( "[1번쓰레드] : 3의 배수 : " + i );
				
				// 1. 다른 스레드를 실행대기 상태로 변경
				// wait(); 호출하여 이 스레드가 일시정지되기 전에 
				// 다른 스레드를 실행대기 상태로 변경해야 된다.
				notify();
				
				try 
				{
					// 2. 이 스레드를 일시정지 상태로 변경
					wait();
				} 
				catch(InterruptedException ie) 
				{
					System.out.println(ie.getMessage());
				}						
				
			}	
			
		}
	}
	
	public synchronized void numPrint2(int num)
	{

		this.setNum(num);

		for( int i = this.num ; i <= 100 ; i++ )
		{
			if ( ( i %5 == 0 ) && ( i %7 == 0 ) )
			{
				System.out.println( "[2번쓰레드] : 5와 7의 공배수 : " + i );
				
				notify();
				
				try 
				{
					wait();
				} 
				catch(InterruptedException ie) 
				{
					System.out.println(ie.getMessage());
				}				
				
			}
			
			
		}
		

		
		
	}
	
	
	
}
