package MatrixSnakes;

public class HWMatrixSnakes
{
	// Ex 4:
	public String hwSnakeEx4( int[][] mat )
	{        
		boolean e=true;
		StringBuilder sb = new StringBuilder();
		for (int i=mat.length-1;i>-1;i--)
			if(e) {
				for (int j= mat[i].length-1;j>-1;j--)
					sb.append(mat[i][j]+" ");
				e=!e;
			}
			else {
				for (int j=0 ;j<mat[i].length;j++)
					sb.append(mat[i][j]+" ");
				e=!e;
			}
		return sb.toString();
	}

    // FILL IN THE CODE FOR EXERCISE 5.
    // The name of the method is hwSnakeEx5 
    // It will NOT have the same method header as Exercise 4.
	public double[] hwSnakeEx5(double[][] mat )
	{
		boolean e=true;
		double[] ret = new double[mat.length*mat[0].length];
		int I=0, i=0;
		for (i=i;i<mat[0].length;i++)
			if(!e) {
				//part a
				for (int j=0; j<mat.length; j++) {
					ret[I]=mat[j][i];
					I++;
				}
				e=!e; 
			}
			else {
				//part b
				for (int j=mat.length-1; j>-1; j--) {
					ret[I]=mat[j][i];
					I++;
				}
				e=!e;
			}
		return ret;
	}
    
    
    // FILL IN THE CODE FOR EXERCISE 6.
    // The name of the method is hwSnakeEx6 
    // It will NOT have the same method header as Exercise 4.
	public double[] hwSnakeEx6(double[][] mat )
	{        
		boolean e=true;
		double[] ret = new double[mat.length*mat[0].length];
		int I=0, i=mat[0].length-1;
		for (i=i;i>-1;i--)
			if(e) {
				for (int j=mat.length-1;j>-1;j--) {
					ret[I]=mat[j][i];
					I++;
				}
				e=!e; 
			}
			else {
				for (int j=0; j<mat.length;j++) {
					ret[I]=mat[j][i];
					I++;
				}
				e=!e;
			}
		return ret;
	}
    

}
