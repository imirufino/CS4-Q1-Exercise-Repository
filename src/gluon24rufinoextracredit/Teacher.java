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
public class Teacher {

    private String name;
    private String subject;
    private ArrayList<Section> sections;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.sections = new ArrayList<>();
    }

    public void giveAssignment(Assignment a) {
        for (Section c : sections) {
            for (Student s : c.getStudents()) {
                s.getAssignments().add(a);
            }
        }
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public  void setSections(ArrayList<Section> Sections) {
        sections = Sections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
