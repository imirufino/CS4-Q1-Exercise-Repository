/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gluon24RufinoSA1bonus;

/**
 *
 * @author staff
 */
public class Exercise {
    private String name;
    private double caloriesPerHour;
    
    public Exercise(String name, double caloriesPerHour){
        this.name = name;
        this.caloriesPerHour = caloriesPerHour;
    }
    public String getName(){
        return this.name;
    }
    public double getCaloriesPerHour(){
        return this.caloriesPerHour;
    }
}