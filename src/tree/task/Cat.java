package tree.task;

public class Cat extends Animal{

    private boolean meow;

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public boolean isMeow() {
        return meow;
    }

    public void setMeow(boolean meow) {
        this.meow = meow;
    }
}
