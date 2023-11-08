/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gluon24RufinoSA1bonus;

/**
 *
 * @author staff
 */
public class Person {
    private String name;
    private double weight, calorieDiff;
    private static int exerCount = 0, mealCount = 0;
    
    public Person(String name, double weight){
        this.name = name;
        this.weight = weight;
        this.calorieDiff = 0;
    }
    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    public static int getExerCount(){
        return exerCount;
    }
    public static int getMealCount(){
        return mealCount;
    }
    public void eat(Food consumed, int servings){
        /*
        Add code here such that:
        - calorieDiff is increased by the calories of the Food consumed and the number of servings
        - mealCount is increased by 1
        - a statement is printed stating that: "<person's name> ate <servings> servings of <food's name>."
        */
        calorieDiff += consumed.getCaloriesPerServing()*servings;
        mealCount++;
        System.out.printf("%s ate %d servings of %s.%n", name, servings, consumed.getName());
        }
    public void exercise(Exercise exercise, double duration){
        /*
        Add code here such that:
        - calorieDiff is decreased by the calories burned by the Exercise and the hours exercised
        - exerciseCount is increased by 1
        - a statement is printed stating that: "<person's name> did <exercise's name> for <duration> hours".
        */
        calorieDiff -= exercise.getCaloriesPerHour()*duration;
        exerCount++;
        System.out.printf("%s did %s for %.1f hours.%n", name, exercise.getName(),duration);        
    }
    public void calculateWeightChange(){
        /*
        Add code here such that:
        - weight is changed based on the value of calorieDiff (7700cal per kg)
        - calorieDiff is set to 0
        - a statememt is printed stating that: <person's name> has <gained/lost> <added/lost weight> and now weighs <person's weight>.
        */
        weight += calorieDiff/7700;
        String gainedOrLost = "";
        double weightChange = Math.abs(calorieDiff/7700);
        if (calorieDiff < 0) {
            gainedOrLost = "lost";
        }
        else {
            gainedOrLost = "gained";
        }
        calorieDiff = 0;
        System.out.printf("%s has %s %.2f kg and now weighs %.2f kg.%n", name, gainedOrLost,weightChange, weight); 
    }
}