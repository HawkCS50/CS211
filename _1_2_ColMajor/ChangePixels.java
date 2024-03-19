package _1_2_ColMajor;
public class ChangePixels
{
    // FILL IN THE CODE.
    // Create your instance variable (a matrix).
    Pixel screen[][];
    // Create your constructor.
    public ChangePixels(int r, int c) {
    	screen = new Pixel[r][c];
    	for (int i=0;i<r;i++)
    		for (int j=0;j<c;j++)
    			screen[i][j] = new Pixel();
    }
    // Create the redStripes() method.
    public Pixel[][] redStripes() {
    	if(screen[0][0]==null) 
    		return null;
    	for(int j=1;j<screen[0].length;j+=2)
    		for(int i=0;i<screen.length;i++)
    			screen[i][j].change("red");
    	return screen;
    }

}
