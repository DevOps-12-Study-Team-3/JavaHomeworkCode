package homework._05_homework._05_middle;

public class Reverse {
	
	public String reverseString( String str )
	{
		
		char reverse_result[] = new char[ str.length() ] ;
		
		String result_String = "";
		
		for ( int i = 0 ; i < str.length() ; i++  )
		{
			
			char reuslt = str.charAt( i ) ;
			
			System.out.println( " 출력 : " + reuslt  );
			
			reverse_result[ i ] = reuslt ;
		}
		
		for( int k = reverse_result.length -1  ; k >= 0 ; k-- )
		{
			
			result_String += reverse_result[k] ;
		
		}
		
//		System.out.print( result_String );
		
		return result_String ;
	}
	
	
	

}
