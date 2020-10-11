public class PairP57 {
    public static void main (String []args){
        PairP57 pair1 = new PairP57();
        pair1.set(1, 2); // why result is (2,2) instead of (1,2)
        pair1.show();
    }
    private int a;
    private int b;

    public PairP57() {
    }

    public PairP57(int x, int y) {
        a = //x;
        b = y;
    }
    public void set(int x, int y) {
        a = //x;
        b = y;
    }
    public void show(){
        System.out.println("( " + a + "," + b + " )");
    }

}
