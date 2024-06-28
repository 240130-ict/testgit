package org.example.callbysomthing;

class Updater{
    void update(Counter counter){
        counter.count++;
    }
}
class Counter{
    int count = 0;
}

public class Sample {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.printf("before update: %d \n",myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.printf("before update: %d \n",myCounter.count);
    }
}
