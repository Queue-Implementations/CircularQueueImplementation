package com.kamaldwip.coding.circularqueues.arrayImpl;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Kamaldwip","Choudhury");
        Employee emp2 = new Employee("Abhinav","Borgohain");
        Employee emp3 = new Employee("Prateek","Sahu");
        Employee emp4 = new Employee("Parag","Roy");
        Employee emp5 = new Employee("Shaibal","Nandy Mazumdar");

        CircularQueue cQueue = new CircularQueue(5);

        cQueue.enQueue(emp1);
        cQueue.enQueue(emp2);
        cQueue.deQueue();
        cQueue.enQueue(emp3);
        cQueue.deQueue();
        cQueue.enQueue(emp4);
        cQueue.deQueue();
        cQueue.enQueue(emp5);
        cQueue.deQueue();
        cQueue.enQueue(emp1);

        cQueue.printQueue();

        System.out.println("Peek : "+ cQueue.peek());

    }
}
