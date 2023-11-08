/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01_glu_rufinoii;

/**
 *
 * @author imruf
 */
public class EX01_GLU_RufinoII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            //Group 1: NMIXX
                String group1Name = "NMIXX";
                String group1Company = "JYP Entertainment";
                int group1Members = 6;
                double group1YearsSinceDebut = 1.523; //as of 1 September, 2023
            
            //Group 2: aespa
                String group2Name = "aespa";
                String group2Company = "SM Entertainment";
                int group2Members = 4;
                double group2YearsSinceDebut = 2.789; //as of 1 September, 2023
            
            //Group 3: NewJeans
                String group3Name = "NewJeans";
                String group3Company = "Hybe Entertainment";
                int group3Members = 5;
                double group3YearsSinceDebut = 1.112; //as of 1 September, 2023
            
            //Display Group 1: NMIXX
                System.out.println("Group 1");
                System.out.println("Group Name: " + group1Name);
                System.out.println("Company Signed Under: " + group1Company);
                System.out.println("Number of Members: " + group1Members);
                System.out.println("Years since debut: " + group1YearsSinceDebut);
                System.out.println();
            
            //Display Group 2: aespa
                System.out.println("Group 2");
                System.out.println("Group Name: " + group2Name);
                System.out.println("Company Signed Under: " + group2Company);
                System.out.println("Number of Members: " + group2Members);
                System.out.println("Years since debut: " + group2YearsSinceDebut);
                System.out.println();
            
            //Display Group 3: Newjeans
                System.out.println("Group 3");
                System.out.println("Group Name: " + group3Name);
                System.out.println("Company Signed Under: " + group3Company);
                System.out.println("Number of Members: " + group3Members);
                System.out.println("Years since debut: " + group3YearsSinceDebut);
                System.out.println();
            
            //Operations:
                int sumOfMembers = group1Members + group2Members + group3Members;
                boolean group2LeastMembers = group2Members < group1Members && group2Members < group3Members;
                boolean group1And2HaveSameCompany = group1Company.equals(group2Company);
                boolean group3MostExperienced = group3YearsSinceDebut > group1YearsSinceDebut && group3YearsSinceDebut > group2YearsSinceDebut;
                
                System.out.println("Total number of members across the three groups: " + sumOfMembers);//operation = sum
                System.out.println("Aespa has the least amount of members: " + group2LeastMembers); //operation = comparison
                System.out.println("NMIXX and aespa are under the same company: " + group1And2HaveSameCompany); //operation = comparison
                System.out.println("NewJeans is the most experienced group of the three: " + group3MostExperienced); //operation = comparison
    }
    
}
