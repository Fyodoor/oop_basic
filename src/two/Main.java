package two;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat neizv = new Cat();
        Cat barsik = new Cat("Barsik");
        Cat snezhok = new Cat("Snezhok", 7, 8.3, "White");


        System.out.println(barsik.getName() + " " + snezhok.getName()
        + " "
        + neizv.getName());
        neizv.setName("Kot");
        neizv.setAge(3);
        neizv.setWeight(5.2);
        neizv.setColor("Grey");

        System.out.println();

        Dog sharik = new Dog("Sharik", 10, 12.5, "white");

        animal.say();
        snezhok.say();
        sharik.say();

    }
}
