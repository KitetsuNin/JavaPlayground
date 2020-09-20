public class Pair33 {
    private int a;
    private int b;

    public Pair33(int x, int y) {
        a=
        b=y;
    }
    public void set(Pair33 p) {
        a = p.a;
        b = p.b;
    }
    public Pair33 add(Pair33 p) {
        Pair33 result = new Pair33(a,b);
        result.a += p.a;
        result.b += p.b;
        return result;
    }
    public void show(String s) {
        System.out.println(s + " ( " + a + "," + b + ")");
    }
}
