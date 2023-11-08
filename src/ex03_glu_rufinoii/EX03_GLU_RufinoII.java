//EX03_GLU_RufinoII

package ex03_glu_rufinoii;

/**
 *
 * @author GLUON
 */
public class EX03_GLU_RufinoII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person niall = new Person("Niall Horan", 29,"13 September 1993", 173);
        Person liam = new Person("Liam Payne", 30,"29 August 1993", 177);
        Person louis = new Person("Louis Tomlinson", 31,"24 December 1993", 172);

        Song asItWas = new Song("As It Was", 167, 2652241409L, "20 May 2023");
        Song pillowtalk = new Song("PILLOWTALK", 202, 1211487938L, "25 March 2016");
    
        Singer zayn = new Singer("Zayn Malik", 0, 0, pillowtalk);
    	Singer harry = new Singer("Harry Styles", 0, 0, asItWas);
        
        zayn.performForAudience(12, pillowtalk);
        zayn.changeFavSong(asItWas);
        zayn.performForAudience(12, asItWas);
        zayn.performForAudience(100, asItWas, harry);
    }
    
}
