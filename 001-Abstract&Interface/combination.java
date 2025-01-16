public interface Swimable {
    public abstract void swim();
}

public interface Flyable {
    public abstract void fly();
}

class Penguin extends Animal implements Swimable
{
    @Override
    public void swim() {
        System.out.println("Penguin is now diving");
    }
}

class Duck extends Animal implements Swimable, Flyable {
    @Override
    public void swim() {
        System.out.println("Duck is floating");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying away from danger");
    }
}


public class Main {
    public static void main(String[] args) {
        Penguin emperor = new Penguin();
        Duck john = new Duck();

        emperor.swim();
        john.swim();
        john.fly();

    }
}