
public class Problem1 {

	 public static void main( String[] args )
	    {
		 int a=0;
	        for(int x=1;x<1000;x++)
	        {
	        	/*if x is a multiple of 3 or 5 print it out */
	        	if(x%3 == 0 || x%5 ==0)
	        	{
	        		/*get the sum of allt he multiples of 3 and 5 */
	        		a=a+x;
	        		  System.out.println( x );
	        	}
	        }
	        System.out.println( a );
	    }
}
