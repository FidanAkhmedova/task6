package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private int age;
    private String name;
    private String surname;

   public Customer(String name, String surname, int age){
       this.name = name;
       this.surname = surname;
       this.age = age;
   }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname);
    }

    @Override
    public int compareTo(Customer o) {
       if (this.getAge() < o.getAge())
           return 1;
       else if(this.getAge() > o.getAge()) return -1;
        return 0;
    }

}
