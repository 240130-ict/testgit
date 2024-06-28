package polumorphism;

interface Barkable {
    void bark();
    String getFood();
}

public class PolymorphismT {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        String rT = bouncer.barkAnimal((Barkable) tiger);
        String rL = bouncer.barkAnimal((Barkable) lion);
        System.out.printf("%s %s \n =======", rL, rT);

        bouncer.barkAnimal((Animal) tiger);
        bouncer.barkAnimal((Animal) lion);
    }
}
