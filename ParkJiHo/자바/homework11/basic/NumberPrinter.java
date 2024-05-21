package homework_my.homework11.basic;

public class NumberPrinter
{
	int num ;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	public void numPrint1(int num)
	{
		this.setNum( num ) ;
		
		for( int i = num ; i <= 50 ; i++ )
		{
			if ( ( i %3 == 0 ) )
			{
				System.out.println( " 3의 배수 : " + i );
			}
		}
	}
	
	public void numPrint2(int num)
	{

		this.setNum(num);	
		
		
		
		for( int i = num ; i <= 100 ; i++ )
		{
			if ( ( i %5 == 0 ) && ( i %7 == 0 ) )
			{
				System.out.println( " 5와 7의 공배수 : " + i );
			}
		}

	}
	
	
	
}
