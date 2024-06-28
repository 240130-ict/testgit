package polumorphism;

public class Bouncer {
    void barkAnimal(Animal animal){
        if(animal instanceof Tiger) {
            System.out.println("어흥");
        } else if(animal instanceof Lion) {
            System.out.println("으르렁");
        }
    }
    String barkAnimal(Barkable barkable) {
        barkable.bark();
        return barkable.getFood();
    }
}


class Animal {}

class Tiger extends Animal implements Barkable {
    @Override
    public void bark() {
        System.out.println("Barkable Tiger");
    }

    @Override
    public String getFood() {
        return "apple";
    }
}
class Lion extends Animal implements Barkable{
    @Override
    public void bark() {
        System.out.println("Barkable Lion");
    }
    @Override
    public String getFood() {
        return "banana";
    }
}
