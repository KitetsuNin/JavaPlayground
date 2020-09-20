public class Three {
    private double a,b,c;

    public Three(double x, double y, double z){
        a=
        b=y;
        c=z;
    }
    public double sum(){
        return a+b+c;
    }
    public double average(){
        return (a+b+c)/3;
    }
    public void increase(){
        a++;
        b++;
        c++;
    }
    public void report(){
        System.out.println("sum " + sum());
        System.out.println("avg " + average());
    }
    public static void main(String[] args){
        Three t = new Three(12,14,4);
        t.report();
        t.increase();
        t.report();
        t.increase();
        t.report();
    }
}