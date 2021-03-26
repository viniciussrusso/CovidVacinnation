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

public class PQElement {
    // Variables
    private Patient element;
    private int key;
    
    // Constructor 
    public PQElement(int priority, Patient e){
        key = priority;
        element = e;
    }
    
    //  Setter and getters
    public Object getElement() {
        return element;
    }

    public void setElement(Patient e) {
        element = e;
    }
    
    public int getKey(){
        return key;
    }
    public void setKey(int value){
        this.key = key;
    }

    // Similar to a toString method, to return elements in a String
    public String printPatient() {
        String msg = "";
        // This if statement if to check if medical condition is true or false and instead of returning true or false it will say Yes or No
        if(element.isCondition() == true){
            msg = "Name: "+element.getName()+ " "+ ", Age: "+element.getAge()+ ", has medical conditions.";
            return msg;
        }else{
            msg = "Name: "+element.getName()+ " "+ ", Age: "+element.getAge()+ ", no medical conditions.";
            return msg;                    
        }   
    }
    
}
