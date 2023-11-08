package ex02_glu_rufinoii;

/**
 *
 * @author GLUON
 */
public class EX02_GLU_RufinoII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        person niall = new person("Niall Horan", 29,"13 September 1993", 173);
        person liam = new person("Liam Payne", 30,"29 August 1993", 177);
        person louis = new person("Louis Tomlinson", 31,"24 December 1993", 172);

        song asItWas = new song("As It Was", 167, 2652241409L, "20 May 2023");
        song watermelonSugar = new song("Watermelon Sugar", 174, 2383053793L, "13 December 2019");
    
        singer zaynMalik = new singer("Zayn Malik", 143, 1432466, watermelonSugar);
    		
        zaynMalik.performForAudience(12, watermelonSugar);
        zaynMalik.changeFavSong(asItWas);
        zaynMalik.performForAudience(12, asItWas);
    }
    
}
