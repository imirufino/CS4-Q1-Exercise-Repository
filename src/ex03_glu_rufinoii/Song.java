//EX03_GLU_RufinoII

package ex03_glu_rufinoii;

/**
 *name - String
noOfPerformances - integer
earnings - double
favoriteSong - Song
performForAudience(given number of people) - increases noOfPerformances by 1 and earnings by 100 for each person (e.g. 5 people results in 500 increase)
changeFavSong(new Song) - changes favoriteSong
 * @author imruf
 */
public class Song {
    //field
    private String songName;
    private int lengthOfSongInSecs;
    private long spotifyStreamCount;
    private String dateReleased;
    
    public Song(String songName, int lengthOfSongInSecs, long spotifyStreamCount, String dateReleased){
        //constructor
        this.songName = songName;
        this.lengthOfSongInSecs = lengthOfSongInSecs;
        this.spotifyStreamCount = spotifyStreamCount;
        this.dateReleased = dateReleased;
    } 

    public String getSongName() {
        return songName;
    }

    public int getLengthOfSongInSecs() {
        return lengthOfSongInSecs;
    }

    public long getSpotifyStreamCount() {
        return spotifyStreamCount;
    }

    public String getDateReleased() {
        return dateReleased;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setLengthOfSongInSecs(int lengthOfSongInSecs) {
        this.lengthOfSongInSecs = lengthOfSongInSecs;
    }

    public void setSpotifyStreamCount(long spotifyStreamCount) {
        this.spotifyStreamCount = spotifyStreamCount;
    }

    public void setDateReleased(String dateReleased) {
        this.dateReleased = dateReleased;
    }
}