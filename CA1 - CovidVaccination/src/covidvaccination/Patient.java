/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidvaccination;

/**
 *
 * @author Vinicius Russo
 * @title DATA STRUCTURES AND ALGORITHMS – Assignment (50%)
 * @date March 2021
 */

public class Patient {
    // Declaring variables
    String name;
    int age;
    boolean condition;
    
    // Constructors
    public Patient(String name, int age, boolean condition) {
        this.name = name;
        this.age = age;
        this.condition = condition;
    }
    public Patient(){
        name = new String();
        age = 0;
        condition = false;
    }
    
    // Sets and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
    
    // Method to String
    @Override
    public String toString() {
        String msg = "";
        // This if statement if to check if medical condition is true or false and instead of returning true or false it will say Yes or No
        if(condition == true){
            msg = "Name: "+ name + ", Age: "+ age +", has medical conditions.\n";
            return msg;
        }else{
            msg = "Name: "+ name + ", Age: "+ age +", no medical conditions.\n";
            return msg;               
        }   
    }
    
}
