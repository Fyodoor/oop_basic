package tree;

public class Person2 implements PeopleInterface{
    @Override
    public void run() {
        System.out.println("Трезво");
    }

    @Override
    public void jump() {
        System.out.println("Низко");
    }

    @Override
    public void laugh() {
        System.out.println("От счаться");
    }

    @Override
    public void cry() {
        System.out.println("Слезами радости");
    }

    @Override
    public void suffer() {
        System.out.println("От большого кол-ва денег");
    }
}
