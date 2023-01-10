package two;

public class Cat extends Animal{


    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    //methods


    @Override
    public void say() {
        System.out.println("Cat said meow");;
    }
}
