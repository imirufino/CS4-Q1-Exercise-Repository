/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gluon24RufinoSA1bonus;

/**
 *
 * @author staff
 */
public class Food {
    private String name;
    private double caloriesPerServing;
    
    public Food(String name, double caloriesPerServing){
        this.name = name;
        this.caloriesPerServing = caloriesPerServing;
    }
    public String getName(){
        return this.name;
    }
    public double getCaloriesPerServing(){
        return this.caloriesPerServing;
    }
}