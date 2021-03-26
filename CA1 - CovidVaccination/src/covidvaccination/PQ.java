/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidvaccination;

import java.util.ArrayList;

/**
 *
 * @author Vinicius Russo
 * @title DATA STRUCTURES AND ALGORITHMS – Assignment (50%)
 * @date March 2021
 */

public class PQ implements PQInterface{
    
    private ArrayList<Patient> all; // Declaring arraylist for all elements
    private ArrayList<PQElement> thePQ; // Declaring arraylist for all PQ elements
    String name; // Declaring String value variable name
    int age; // Declaring Integer variable age
    boolean condition; // Declaring Boolean variable condition
    
    // Constructor
    public PQ(){
        all = new ArrayList<>();
        thePQ = new ArrayList<PQElement>(); // creating arraylist
        name = "";
        age = 0;
        condition = false;
    }
    
    // To find front element of the queue
    public PQElement getElement(int index){
            return thePQ.get(index);
    }

    // To find where elements are going
    private int findInsertPosition(int newkey){
        boolean found;
        PQElement elem;
        int position;
        found = false;
        position =0;
        
        while (position<thePQ.size() && !found){
            elem = thePQ.get(position);
            if(elem.getKey()>newkey)  
                position = position +1;
            else{
                found = true;
            }
          }
        return position;
    }
    
    // Adding elements to the normal queue and to a priority queue
    @Override
    public void enqueue(Object element) {
        // Adding patients to list without priority
        all.add((Patient) element);
        
        // Declaring local priorkey as a int variable
        int priorkey = 0;
        
        // Create temporary Patient with the element you're passing into enqueue, and get age of that patient
        Patient p = (Patient)element;
        age = p.getAge();
        condition = p.condition;
        
        // Checking which priority should be given to patients added
        if (age >= 90) {
            priorkey = 10;
        } else if (age >= 80 && age <= 89) {
            priorkey = 9;
        } else if (age >= 70 && age <= 79) {
            priorkey = 8;
        } else if (age >= 65 && age <= 69) {
            priorkey = 7;
        } else if ((age >= 18 && age <= 64) && condition == true) {
            priorkey = 6;
        } else if ((age >= 55 && age <= 64) && condition == false) {
            priorkey = 5;
        } else if ((age >= 45 && age <= 54) && condition == false) {
            priorkey = 4;
        } else if ((age >= 30 && age <= 44) && condition == false) {
            priorkey = 3;
        } else if ((age >= 18 && age <= 29) && condition == false) {
            priorkey = 2;
        } else {
            priorkey = 1;
        }
        
        // Adding priority to elements
        int index;
        PQElement elem = new PQElement(priorkey,(Patient)element);
        
        index = findInsertPosition(priorkey);
        
        if (index ==size())
            thePQ.add(elem);
        else
            thePQ.add(index, elem);
        
    }

    // Remove element from queue
    @Override
    public Object dequeue(){
        return thePQ.remove(0);
    }
    
    // Returns size of queue
    @Override
    public int size() {
        return thePQ.size();
    }

    // To check if queue is empty
    @Override
    public boolean isEmpty() {
        return thePQ.isEmpty();
    }
    
    public int sizeTotal(){
        return all.size();
    }
    
    // Return all items on priority queue
    public String printPQueue(){
        String printStr = new String();
        PQElement elem;
        for (int i = 0; i<thePQ.size();i++){
            elem = thePQ.get(i);
            printStr = printStr.concat (elem.printPatient()+" "+"Priority ="+elem.getKey()+"\n");
        }
        return printStr;
    }
    
    // To return all items on queue
    @Override
    public String toString() {
        return  "Patients: \n" + all + '}';
    }

}
