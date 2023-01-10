package tree.task;

public class Main {
    public static void main(String[] args) {
        /**
         Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
         Класс Animal содержит переменные food, location и методы makeNoise,
         eat, sleep. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
         Dog, Cat, Horse переопределяют методы makeNoise, eat.
         Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
         Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
         Пусть этот метод распечатывает food и location пришедшего на прием животного.
         В методе main создайте массив типа Animal, в который запишите животных всех имеющихся
         у вас типов. В цикле отправляйте их на прием к ветеринару.
         * */

        Animal [] zooPark = new Animal[10];

        Dog sharik = new Dog();
        Cat murzik = new Cat();
        Horse horse = new Horse();

        sharik.setFood("Bones");
        sharik.setLocation("Dvor");

        murzik.setFood("Milk");
        murzik.setLocation("Dvor");

        horse.setFood("Seno");
        horse.setLocation("Sarai");

        zooPark [0] = sharik;
        zooPark [1] = murzik;
        zooPark [2] = horse;

        Veterinar aibolit = new Veterinar();

        for (int i = 0; i < zooPark.length; i++) {
            if (zooPark[i] != null) {
                aibolit.treatAnimal(zooPark[i]);
            }
        }

    }
}
