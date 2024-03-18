import package1.SameName;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Vitaliy", "Bunyak", "Serhiyovich", "JavaDeveloper", "vvvvvv@gmail.com", 1111111111, 18);
        SameName sameName1 = new SameName("Vitaliy", 18);
        package2.SameName sameName2 = new package2.SameName();
        sameName2.hello();
        Car car = new Car();
        car.start();
    }
}
