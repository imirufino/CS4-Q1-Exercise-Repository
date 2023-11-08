/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02_glu_rufinoii;

/**
 *name - String
noOfPerformances - integer
earnings - double
favoriteSong - Song
performForAudience(given number of people) - increases noOfPerformances by 1 and earnings by 100 for each person (e.g. 5 people results in 500 increase)
changeFavSong(new Song) - changes favoriteSong
 * @author imruf
 */
public class song {
    //field
    String name;
    int lengthOfSongInSecs;
    long spotifyStreamCount;
    String dateReleased;
    
    public song(String n, int lSS, long sSC, String dR){
        //constructor
        name = n;
        lengthOfSongInSecs = lSS;
        spotifyStreamCount = sSC;
        dateReleased = dR;
    } 
}