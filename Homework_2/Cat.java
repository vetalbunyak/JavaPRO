public class Cat extends Animals{
    public static int count = 0;


    public Cat(String name, int maxDistanceRun) {
        super(name, maxDistanceRun, 0);
        count++;
    }
}
