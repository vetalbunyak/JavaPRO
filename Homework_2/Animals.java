public abstract class Animals {
    private String name;
    private int  maxDistanceRun;
    private int maxDistanceSwim;
    public static int count = 0;

    public Animals(String name, int maxDistanceRun, int maxDistanceSwim) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
        count++;
    }

    public void run (int distance)
    {
        if (distance <= maxDistanceRun)
        {
            System.out.println(name + " run" + " " + distance);
        }
        else
        {
            System.out.println(name + " could not run" + " " + distance + "m");
        }
    }


    public void swim (int distance)
    {
        if (distance <= maxDistanceSwim)
        {
            System.out.println(name + " swam" + " " + distance);
        }
        else if(maxDistanceSwim == 0)
        {
            System.out.println(name + " can't swim");
        }
        else
        {
            System.out.println(name + " could not swim" + " " + distance + "m");
        }
    }
}
