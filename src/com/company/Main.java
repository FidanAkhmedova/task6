package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cusName, cusSurname;
        int cusAge;
        PriorityQueue<Customer> queue = new PriorityQueue<>();
//        LinkedList<Customer> queue = new LinkedList<>();
//        ArrayDeque<Customer> queue = new ArrayDeque<>();
        System.out.println("Enter name, surname and age of new Customer");

        while(true) {

            System.out.println("Enter customer name: ");
            cusName = scanner.next();
            if (cusName.equals("exit")) break;

            System.out.println("Enter customer surname: ");
            cusSurname = scanner.next();
            if (cusSurname.equals("exit")) break;

            System.out.println("Enter customer age: ");
            cusAge = scanner.nextInt();

            Customer customer = new Customer(cusName, cusSurname, cusAge);
            addToList(queue,customer);
            System.out.println("queue " + queue);

        }

        System.out.println("Before sort Collection ---------------------------------------------------------------------------");
        Iterator<Customer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println("\n " + iterator.next());
        }

        queue.stream().sorted(); //Priority Queue sort
        //Collections.sort(queue); //LinkedList sort
        System.out.println("After sort Collection ---------------------------------------------------------------------------");
        displayQueue(queue);

        System.out.println("Removing elements --------------------------------------------------------------------------------");
        deleteFromList(queue);
        System.out.println(queue.isEmpty() ?  "Collection is empty !!!" : "Collection is not empty");
    }
///
    public static void addToList(Queue<Customer> queue, Customer customer){
        queue.add(customer);
    }
    public static void displayQueue(Queue<Customer> queue){
        Iterator<Customer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println("\n " + iterator.next());
        }
    }
    public static void deleteFromList(Queue<Customer> queue){
        Iterator<Customer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println("\n " + iterator.next());
            iterator.remove();
        }
    }

}
