/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02_glu_rufinoii;

/**
 *
 * @author imruf
 */
public class singer {
    //field
    String name;
    int noOfPerformances;
    double earnings;
    song favoriteSong;
    
    public singer(String n, int nP, double e, song fS){
        //constructor
        name = n;
        noOfPerformances = nP;
        earnings = e;
        favoriteSong = fS;
    } 
    
    public void performForAudience(int nA, song s) {
        //method
        noOfPerformances += 1;
        earnings += 100*nA;    
        
        System.out.println();System.out.println(name + " performs " + s.name + " in front of " + nA + " people.");
	System.out.println("Current Number of Performances: " + noOfPerformances);
	System.out.println("Current Earnings: " + earnings + "\n");
	}
     
    public void changeFavSong(song fS) {
        //method
        favoriteSong = fS;
        System.out.println(favoriteSong.name + " is now " + name +"'s favorite song");
    }
}