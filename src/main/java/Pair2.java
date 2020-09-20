/**
 * tworzy pare z dwoch liczb
 */
public class Pair2 {
    private int a;
    private int b;

    /**
     * przypisuje argumenty do odpowiednich pol
     *
     * @param x
     * @param y
     */
    public Pair2(int x, int y) {
        a = x;
        b = y;
    }

    public void set(int x, int y) {
        a = x;
        b = y;
    }

    public void show() {
        System.out.println("( " + a + "," + b + ")");
    }
}
