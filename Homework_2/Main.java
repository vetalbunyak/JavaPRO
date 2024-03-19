public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
            new Dog("Bob", 500, 10),
            new Dog("Barsik", 500, 10),
            new Cat("Kitty", 200),
            new Cat("Murzik", 200),
        };

        for (Animals i : animals)
        {
            i.run(600);
            i.swim(30);
        }
        System.out.println("All animals count = " + Animals.count);
        System.out.println("Cats count = " + Cat.count);
        System.out.println("Dogs count = " + Dog.count);
    }
}
