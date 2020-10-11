public class PairP61 {

    private int a;
    private int b;

    public PairP61(int x, int y) {
        a=
        b=y;
    }
    public void set(PairP61 p) {
        a = p.a;
        b = p.b;
    }
    public PairP61 add(PairP61 p) {
        PairP61 result = new PairP61(a,b);
        result.a += p.a;
        result.b += p.b;
        return result;
    }
    public void show(String s) {
        System.out.println(s + " ( " + a + "," + b + ")");
    }

}
