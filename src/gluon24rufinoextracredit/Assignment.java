/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gluon24rufinoextracredit;

/**
 *
 * @author imruf
 */
public class Assignment {
    //fields
    private String name;
    private double timeAlloted;

    //constructors
    public Assignment(String name, double timeAllotted) {
        this.name = name;
        this.timeAlloted = timeAllotted;
    }

    //getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTimeAllotted() {
        return timeAlloted;
    }

    public void setTimeAlloted(double timeAllotted) {
        this.timeAlloted = timeAlloted;
    }
}
