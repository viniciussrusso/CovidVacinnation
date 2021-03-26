package covidvaccination;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius Russo
 * @title DATA STRUCTURES AND ALGORITHMS – Assignment (50%)
 * @date March 2021
 */

public interface PQInterface {
    public void enqueue(Object element);
    public Object dequeue();
    public int size();
    public boolean isEmpty();
    public String printPQueue();    
    public PQElement getElement(int index);
}
