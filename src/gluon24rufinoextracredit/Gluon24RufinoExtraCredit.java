/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gluon24rufinoextracredit;

/**
 *
 * @author imruf
 */
public class Gluon24RufinoExtraCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Toptop Mungcal", "Health");
        Teacher t2 = new Teacher("CK Salome", "Math");
        Teacher t3 = new Teacher("Aldrich Ty", "Social Science");
        Section c1 = new Section("Gluon");
        Section c2 = new Section("Potassium");
        Assignment a1 = new Assignment("FA3", 2);
        Assignment a2 = new Assignment("AA1", 3);
        Assignment a3 = new Assignment("HW2", 5);
        Student s1 = new Student("Mio Dizon");
        Student s2 = new Student("Raph Tagle");
        Student s3 = new Student("Mark Tan");
        
        c1.addStudent(s1);
        c1.addStudent(s2);
        c2.addStudent(s3);
        
        t1.getSections().add(c1);
        t1.getSections().add(c2);
        t2.getSections().add(c2);
        t3.getSections().add(c1);
        
        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);
        s2.finishAssignment(a1);
        System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
    }

}

/*You are trying to create a simplified LMS for the school. You conceptualize four classes for this to work: Teacher, Assignment, Section, and Student. They are specified as follows:

Teacher class
        name - String
        subject - String
        sections - ArrayList<Section> or Section[]
giveAssignment(Assignment a) - adds the Assignment to each Student in all the sections he/she handles

        Section class
        name - String
        students - ArrayList<Student>
        addStudent(Student s) - adds a Student to the section

        Assignment class
        name - String
        timeAllotted - double

Student class
        name - String
        assignments - ArrayList<Assignment>
finishAssignment(Assignment a) - removes the specified assignment from the student
getTimeNeeded() - returns total timeAllotted of all the Assignments of the student

You may add more fields and methods as you see fit, but assuming good constructors, the ones specified above will be enough.

This extra credit is worth 2pts to your raw score at the end of the quarter. Each complete, independent and functional class is worth 0.5pt each. A complete class is determined by an appropriate constructor, getter and setter methods, and follows the usual conventions of Java.

To help you test your classes, assuming the following instances in the main method:

Teacher t1: teaches Section c1 and c2
Teacher t2: teaches Section c2
Teacher t3: teaches Section c1
Section c1: has Student s1 and s2
Section c2: has Student s3
Assignment a1: has timeAllotted 2
Assignment a2: has timeAllotted 3
Assignment a3 has timeAllotted 5
And additional Student instances s1, s2, and s3
Given the following code:

t1.giveAssignment(a1);
t2.giveAssignment(a2);
t3.giveAssignment(a3);
s2.finishAssignment(a1);
System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
Should result in 7, 5, and 5 respectively.*/
