package org.example;

class Creature {
    String name;
    public void setName(String name){
        this.name = name;
    }
}

class Animal extends Creature {
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public void setCreatureName(String name){
        super.name = name;
    }
    void sleep(String sound) {
        System.out.println(sound + "!!!!!");
    }
}

class Dog extends Animal {
    void sleep(String sound){
        System.out.println(sound);
        super.sleep(sound);
    }
}

public class Sample {
    public static void main(String[] args) {
        Animal dog = new Dog();


        dog.sleep("zzzzzzz");

    }
}