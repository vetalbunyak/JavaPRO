public class Dog extends Animals{
    public static int count = 0;

    public Dog(String name, int maxDistanceRun, int maxDistanceSwim) {
        super(name, maxDistanceRun, maxDistanceSwim);
        count++;
    }

}
