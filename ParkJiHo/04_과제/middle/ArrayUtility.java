package homework.middle._04_;

public class ArrayUtility {

	
	
	  public static double[] intToDouble( int[] source )	// int배열을 double배열로 변환
	  {
		  System.out.println( "int배열을 dobule로 변경합니다." );
		  
		  double reuslt [] = new double[ source.length ] ;
			
		  for ( int i = 0 ;  i < source.length  ; i++  )
		  {
			  
			  reuslt[ i ] = ( double )source[ i ] ;
			  
			  System.out.print( reuslt[ i ] + " " );
		  }
		  
		  System.out.println( "\n===================\n" );
		  
		  return reuslt ;
		   
	  }
	  
	  public static int[] doubleToInt( double[] source )	// double배열을 int배열로 변환
	  {
		  
		  System.out.println( "dobule배열을 int로 변경합니다." );
		  
		  int reuslt [] = new int[ source.length ] ;
			
		  for ( int i = 0 ;  i < source.length  ; i++  )
		  {
			  
			  reuslt[ i ] = ( int )source[ i ] ;
			  
			  System.out.print( reuslt[ i ] + " " );
		  }
		  
		  System.out.println( "\n===================\n" );
		  
		  return reuslt ;
		   	  
	  }
	
	
	
	
	
}
