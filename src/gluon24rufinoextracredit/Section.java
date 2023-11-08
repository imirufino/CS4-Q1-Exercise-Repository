/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gluon24rufinoextracredit;

import java.util.ArrayList;
        
/**
 *
 * @author imruf
 */
public class Section {
    //fields
    private String name;
    private ArrayList <Student> students;

    //constructors
    public Section(String name) {
        this.name = name;
        this.students = new ArrayList <> ();
    }
    
    //methods
    public void addStudent(Student s) {
        students.add(s);
    }
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
