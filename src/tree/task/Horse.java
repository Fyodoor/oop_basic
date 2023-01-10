package tree.task;

public class Horse extends Animal{

    private boolean canJump;

    @Override
    public void makeNoise() {
        System.out.println("Horse a sleep");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public boolean isCanJump() {
        return canJump;
    }

    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }
}
