public class Song
{    
    private String title;
    private String artist;
    private int timesPlayed;

    public Song( String myTitle, 
               String myArtist, int times )
    {
        title = myTitle;
        artist = myArtist;
        timesPlayed = times;
    }

    public String getTitle()
    {
        return title;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public int getTimesPlayed()
    {
        return timesPlayed;
    }  
 }
