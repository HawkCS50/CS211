package _1_2_ColMajor;
public class PixelRunner
{
    public static void main( String[] args )
    {
        // UNCOMMENT THE CODE BELOW (to test your code).
        
        ChangePixels pixies = new ChangePixels( 8, 10 );
        Pixel[][] answer = pixies.redStripes();
        printRowMajor( answer );
        System.out.println( "-------------------------------\n" );
        
        ChangePixels morePixies = new ChangePixels( 14, 7 );
        
        Pixel[][] ans = morePixies.redStripes( );
        printRowMajor(ans);
    }
    public static void printRowMajor(Pixel[][] n)
    {
    	for(int i=0;i<n.length;i++) {
    		for(int j=0;j<n[0].length;j++)
    			System.out.print(n[i][j] + " ");
    		System.out.println();
    	}
    }
}
