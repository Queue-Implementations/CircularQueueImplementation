package com.kamaldwip.coding.circularqueues.arrayImpl;

import java.util.NoSuchElementException;

public class CircularQueue {

    private Employee[] cQueue;
    private int front;
    private int back;

    public CircularQueue(int capacity) {
        cQueue = new Employee[capacity];
    }

    public void enQueue(Employee employee){

        if(size() == cQueue.length - 1){
            int numOfItems = size();
            Employee[] newArray = new Employee[2 * cQueue.length];
            System.arraycopy(cQueue,front,newArray,0, cQueue.length - front);
            System.arraycopy(cQueue,0,newArray,cQueue.length - front,back);
            cQueue = newArray;
            back = numOfItems;
            front = 0;
        }

        cQueue[back] = employee;

        if(back < cQueue.length - 1){
            back ++;
        } else {
            back = 0;
        }

    }

    public Employee deQueue(){

        if(size() == 0){
            throw new NoSuchElementException();
        }
        Employee employee = cQueue[front];
        cQueue[front] = null;
        front++;

        if(size() == 0){
            front = 0;
            back = 0;
        }
        else if (front == cQueue.length){
            front = 0;
        }
        return employee;
    }


    public int size(){
        if(front < back){
            return back - front;
        } else {
            return back - front + cQueue.length;
        }
    }

    public Employee peek(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        return cQueue[front];
    }

    public void printQueue(){

        if(front < back){
            for(int i = front;i < back;i++){
                System.out.println(cQueue[i]);
            }
        }
        else {

            for(int i = front;i < cQueue.length;i++){
                System.out.println(cQueue[i]);
            }

            for(int i = 0; i < back;i++){
                System.out.println(cQueue[i]);
            }
        }



    }

}
