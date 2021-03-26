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

public class CovidVaccinationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI gui = new GUI();
        gui.setVisible(true);
        
        // ArrayList for patients registered
        ArrayList<Patient> all;
        all = new ArrayList<>();

        // Setting values to patient 1
        Patient p1 = new Patient();
        p1.setAge(23);
        p1.setCondition(false);
        p1.setName("Rafael");
        all.add(p1); // adds to the arraylist
         
        // Setting values to patient 2
        Patient p2 = new Patient();
        p2.setAge(37);
        p2.setCondition(false);
        p2.setName("Rodrigo");
        all.add(p2); // adds to the arraylist
        
        // Setting values to patient 3
        Patient p3 = new Patient();
        p3.setAge(25);
        p3.setCondition(true);
        p3.setName("Joanne");
        all.add(p3); // adds to the arraylist
        
        // Setting values to patient 4
        Patient p4 = new Patient();
        p4.setAge(89);
        p4.setCondition(false);
        p4.setName("Sally");
        all.add(p4); // adds to the arraylist
        
        // Setting values to patient 5
        Patient p5 = new Patient();
        p5.setAge(87);
        p5.setCondition(true);
        p5.setName("Laura");
        all.add(p5); // adds to the arraylist
        
        
        // Instance of PQ class 
        PQ pq = new PQ();
        
        // Display list of all patients registered
        System.out.println("List of patients registered >>>>>> \n"+all.toString()); 
        
        // Enqueueing objects to Priority Queue
        pq.enqueue(p1);
        pq.enqueue(p2);
        pq.enqueue(p3);
        pq.enqueue(p4);
        pq.enqueue(p5);
        
        //Display list of all objects in priority queue
        System.out.println("Priority queue >>>>\n"+pq.printPQueue()); 
        
        // Display sizes
        System.out.println("All registered patients list size: "+all.size());
        System.out.println("All schedule patients size: "+pq.size());
        
        // Scheduling patient group - deleting group with highest priority
        PQElement headElement;
        PQInterface myPQ;

        headElement = pq.getElement(0);
        int firstKey = headElement.getKey();
        int newKey = 0;

        do{
            Patient temp = (Patient)headElement.getElement();
            String name = temp.getName();
            int age = temp.getAge();
            boolean condition = temp.condition;

            pq.dequeue();


            if(pq.isEmpty() == false){
                PQElement nextElement = pq.getElement(0);
                newKey = nextElement.getKey();
            }

        }while(newKey == firstKey && pq.isEmpty() == false);
        
        System.out.println("All schedule patients size after scheduling: "+pq.size());
        System.out.println("All registered patients list size: "+all.size()+"\n");
        
        System.out.println("Priority queue >>>>\n"+pq.printPQueue());
        System.out.println("List of patients registered >>>>\n"+all.toString()); 
        
        
        
    }
    
}
