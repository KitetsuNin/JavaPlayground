public class Counter {
    private static int objectCount;
    private int counter;

    public Counter(){
        objectCount++;
    }

    private void increase(){
     counter++;
    }
    public void report(){
        System.out.println("objects created " + objectCount);
        System.out.println("counter in object" + counter);
    }
    public static void main (String [] args){
        Counter s1 = new Counter();
        s1.increase();
        s1.increase();
        s1.report();

        Counter s2 = new Counter();
        s2.report();
    }
}
