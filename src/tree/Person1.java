package tree;

public class Person1 implements PeopleInterface{
    @Override
    public void run() {
        System.out.println("Трусцой");
    }

    @Override
    public void jump() {
        System.out.println("Высоко");
    }

    @Override
    public void laugh() {
        System.out.println("Взахлёб");
    }

    @Override
    public void cry() {
        System.out.println("От счаться");
    }

    @Override
    public void suffer() {
        System.out.println("Недолго");
    }
}
