//EX03_GLU_RufinoII

package ex03_glu_rufinoii;

/**
 *
 * @author imruf
 */
public class Singer {

    public static int getTotalPerformances() {
        return totalPerformances;
    }

    public static void setTotalPerformances(int aTotalPerformances) {
        totalPerformances = aTotalPerformances;
    }
    //field
    private String singerName;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    
    public Singer(String singerName, int noOfPerformances, double earnings, Song favoriteSong){
        //constructor
        this.singerName = singerName;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    } 
    
    private static int totalPerformances = 0;
    
    public void performForAudience(int noOfAudience, Song songPeformed) {
        //method
        noOfPerformances += 1;
        earnings += 100*noOfAudience;
        totalPerformances +=1;
        
        System.out.println();System.out.println(singerName + " performs " + songPeformed.getSongName() + " in front of " + noOfAudience + " people.");
	System.out.println("Current Number of Performances: " + noOfPerformances);
	System.out.println("Current Earnings: " + earnings + "\n");
        System.out.println("Total Number of Performances: " + noOfPerformances);
	}
    
    public void performForAudience(int noOfAudience, Song songPeformed, Singer artistCollab) {
        //method
        noOfPerformances += 1;
        earnings += 100*noOfAudience/2;
        artistCollab.earnings += 100*noOfAudience/2;
        totalPerformances += 2;
       
        
        System.out.println();System.out.println(singerName + " performs " + songPeformed.getSongName() + " with " + artistCollab.getSingerName() + " in front of " + noOfAudience + " people.");
	System.out.println("Current Number of Performances: " + noOfPerformances);
	System.out.println("Current Earnings: " + earnings  + " for " + singerName + " and " + artistCollab.earnings + " for " + artistCollab.singerName + "\n");
        System.out.println("Total Number of Performances: " + totalPerformances);
	}
     
    public void changeFavSong(Song favoriteSong) {
        //method
        this.favoriteSong = favoriteSong;
        System.out.println("\n" + favoriteSong.getSongName() + " is now " + singerName +"'s favorite song");
    }

    public String getSingerName() {
        return singerName;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
}