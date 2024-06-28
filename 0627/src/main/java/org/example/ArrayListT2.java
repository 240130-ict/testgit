package org.example;

import java.util.ArrayList;

public class ArrayListT2 {
    public static void main(String[] args) {
        Person[] persons = new Person[15]; // 배열로 선언
        ArrayList<Person> list = new ArrayList<Person>(); //리스트로 선언
        list.add(new Person("a",22));
        list.add(new Person("b",24));
        list.add(new Person("c",30));
        Person p = list.get(0);
        System.out.printf("name: %s, age: %s\n",p.name,p.age);

        for (Person person : list) {
            System.out.printf("name: %s, age: %s\n",person.name,person.age);
        }

        Person[] person2 = new Person[]{
            new Person("a",22),
        };
        ArrayList<Person> list2 = new ArrayList<Person>();
        for (Person person : person2) {

        }
    }
}

class Person {
    String name;
    Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
