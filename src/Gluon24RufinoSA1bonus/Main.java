/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gluon24RufinoSA1bonus;

import java.util.Scanner;

/**
 *
 * @author staff
 */
public class Main {
    public static void main(String[] args){
        /*
        You are writing in the main method of the application. The application is meant to track the person't weight after eating and exercising. You may wish to copy-paste segments of the code as you're working on it to avoid the errors in the latter part of the file.
        
        For this application, there are 3 different exercises and foods available:
        - running: 700 calories per hour
        - swimming: 890 calories per hour
        - biking: 650 calories per hour
        
        - salad: 190 calories per serving
        - pizza: 273 calories per serving
        - fried chicken: 246 calories per serving
        
        Create instances of the indicated activities. Assign them to variables exer1, food1, etc.
        
        Score: 5pts
        */
        Exercise exer1 = new Exercise("running", 700);
        Exercise exer2 = new Exercise("swimming", 890);
        Exercise exer3 = new Exercise("biking", 650);
        
        Food food1 = new Food("salad", 190);
        Food food2 = new Food("pizza", 273);
        Food food3 = new Food("fried chicken", 246);
        
        Scanner scan =  new Scanner(System.in);
        Person joe = new Person("Joe", 71);
        Person jane = new Person("Jane", 54.8);
        
        // For the remainder of the problem, simply replace the blank spaces with the appropriate code to make the application work. Each blank is worth 0.5pts.
        // Score:
        
        // Application will loop for as long as Person's exerCount and mealCount total are less than 10.
        while(Person.getExerCount() + Person.getMealCount() < 10){
            Person selectedPerson = null;
            System.out.print("Who will do an activity, Joe or Jane?");
            String name = scan.nextLine();
            
            switch(name){
                case "Joe":
                    selectedPerson = joe;
                    break;
                case "Jane":
                    selectedPerson = jane;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
            
            System.out.printf("Will %s eat or exercise? ", selectedPerson.getName());
            String action = scan.nextLine();
            if(action.equalsIgnoreCase("eat")){
                Food selectedFood = null;
                System.out.printf("What food will %s eat? ", selectedPerson.getName());
                String activity =  scan.nextLine();

                switch(activity){
                    case "salad":
                        selectedFood = food1;
                        break;
                    case "pizza":
                        selectedFood = food2;
                        break;
                    case "fried chicken":
                        selectedFood = food3;
                        break;
                    default:
                        System.out.println("Invalid input");
                        continue;
                }

                // Expercted output: How many servings of <food's name> will <person's name> eat?
                System.out.printf("How many servings of %s will %s eat? ", selectedFood.getName(), selectedPerson.getName());
                int servings =  Integer.parseInt(scan.nextLine());

                // The selected person will eat the number of servings of the specified food.
                selectedPerson.eat(selectedFood, servings);
            }
            else if(action.equalsIgnoreCase("exercise")){
                Exercise selectedExercise = null;
                System.out.printf("What exercise will %s do? ", selectedPerson.getName());
                String activity =  scan.nextLine();

                switch(activity){
                    case "running":
                        selectedExercise = exer1;
                        break;
                    case "swimming":
                        selectedExercise = exer2;
                        break;
                    case "biking":
                        selectedExercise = exer3;
                        break;
                    default:
                        System.out.println("Invalid input");
                        continue;
                }

                // Expercted output: How long will <person's name> do <activity name>?
                System.out.printf("How long will %s do %s", selectedPerson.getName(), selectedExercise.getName());
                int duration =  Integer.parseInt(scan.nextLine());

                // The selected person will do the activity for the specified duration.
                selectedPerson.exercise(selectedExercise, duration);
                }
            else{
                System.out.println("Invalid input.");
            }
            
        }
        joe.calculateWeightChange();
        jane.calculateWeightChange();
    }
}