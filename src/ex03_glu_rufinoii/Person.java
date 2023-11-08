//EX03_GLU_RufinoII

package ex03_glu_rufinoii;

/**
 *
 * @author imruf
 */
public class Person {
    //fields
    private String personName;
    private int age;
    private String birthday;
    private int heightInCm;
    
    public Person(String personName, int age, String birthday, int heightInCm){
        //constructors
        this.personName = personName;
        this.age = age;
        this.birthday = birthday;
        this.heightInCm = heightInCm;
    } 

    public String getPersonName() {
        return personName;
    }

    public int getAge() {
        return age;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }
}
