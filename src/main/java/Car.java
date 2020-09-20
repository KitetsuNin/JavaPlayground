public class Car {

    private static int milage = 100;

    //class fields
    private String carName;
    private int maxSpeed;
    private int carAge;

    //constructor
    public Car(String name, int speed) {
        carName = name;
        maxSpeed = speed;
    }

    public Car(String name, int speed, int age) {
        carName = name;
        maxSpeed = speed;
        carAge = age;
    }

    //method
    public void print() {
        System.out.println(carName);
        System.out.println(maxSpeed);
        System.out.println(carAge);
        System.out.println(milage);
    }

    //public static void printCarAge() {
        //System.out.println(carAge);
    //}

    public String getCarName() {
        return carName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCarAge() {
        return carAge;
    }
}

