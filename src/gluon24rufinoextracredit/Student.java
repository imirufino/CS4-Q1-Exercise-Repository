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
public class Student {
    
    private String name;
    private ArrayList <Assignment> assignments;

    public Student(String name) {
        this.name = name;
        this.assignments = new ArrayList <> ();
    }
    
    public void finishAssignment(Assignment a) {
        assignments.remove(a);
    }
    
    public double getTimeNeeded() {
        double totalTimeNeeded = 0;
        for (Assignment a : assignments) {
            totalTimeNeeded += a.getTimeAllotted();
        }
        return totalTimeNeeded; 
    }

    public ArrayList <Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList <Assignment> aAssignments) {
        assignments = aAssignments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
