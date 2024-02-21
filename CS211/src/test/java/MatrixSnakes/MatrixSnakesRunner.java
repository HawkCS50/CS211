package MatrixSnakes;

public class MatrixSnakesRunner {
	public static void main( String[] args )
	{
		HWMatrixSnakes myNotes = new HWMatrixSnakes();

		// Testing Exercise 4:
		int[][] mat4a = 
			{  
					{ 1,    2,  3,   4,   5 },
					{ 6,   7,   8,   9,   10 },
					{ 11, 12, 13, 14, 15 },
					{ 16, 17, 18, 19, 20 },
					{ 21, 22, 23, 24, 25 },
					{ 26, 27, 28, 29, 30 }
			};

		int[][] mat4b = 
			{  
					{ 51, 52, 53, 54, 55 }, 
					{ 1,  2,  3,  4,  5 }, 
					{ 6,  7,  8,  9,  10 }, 
					{ 11, 12, 13, 14, 15 }, 
					{ 16, 17, 18, 19, 20 }, 
					{ 21, 22, 23, 24, 25 }, 
					{ 26, 27, 28, 29, 30 }
			};

		System.out.println( "Exercise 4, Test A:" );
		String output4a = myNotes.hwSnakeEx4( mat4a );
		System.out.println( output4a );

		System.out.println( "\nExercise 4, Test B:" );
		String output4b = myNotes.hwSnakeEx4( mat4b );
		System.out.println( output4b );

		// Testing Exercises 5 and 6:

		double[][] dubMatA = 
			{ 
					{ 1.1, 2.2, 3.3, 4.4, 5.5 },
					{ 6.6, 7.7, 8.8, 9.9, 10.1 },
					{ 11,  12,  13,  14,  15 },
					{ 16,  17,  18,  19,  20 },
					{  21, 22,  23,  24,  25 },
					{  26, 27,  28,  29,  30 }
			};                

		double[][] dubMatB =
			{ 
					{ 51, 1.1, 2.2, 3.3, 4.4, 5.5 },
					{ 52, 6.6, 7.7, 8.8, 9.9, 10.1 },
					{ 53, 11,  12,  13,  14,  15 },
					{ 54, 16,  17,  18,  19,  20 },
					{ 55, 21, 22,  23,  24,  25 }, 
					{ 56, 26, 27,  28,  29,  30 }
			};

		System.out.println( "\nExercise 5, Test A:" );        

		double[] solEx5a = myNotes.hwSnakeEx5( dubMatA );
		for( int i = 0; i < solEx5a.length; i++ )
		{
			System.out.print( solEx5a[ i ] + " " );
		}

		System.out.println( "\n\nExercise 5, Test B:" );        

		double[] solEx5b = myNotes.hwSnakeEx5( dubMatB );
		for( int i = 0; i < solEx5b.length; i++ )
		{
			System.out.print( solEx5b[ i ] + " " );
		}

		System.out.println( "\n\nExercise 6, Test A:" );  

		double[] solEx6a = myNotes.hwSnakeEx6( dubMatA );      
		for( int i = 0; i < solEx6a.length; i++ )
		{
			System.out.print( solEx6a[ i ] + " " );
		}     

		System.out.println( "\n\nExercise 6, Test B:" );  

		double[] solEx6b = myNotes.hwSnakeEx6( dubMatB );      
		for( int i = 0; i < solEx6b.length; i++ )
		{
			System.out.print( solEx6b[ i ] + " " );
		}      
	}
}
