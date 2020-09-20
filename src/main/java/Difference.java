public class Difference {
    public static void main(String[] args) {
        int x, y , z;
        x = 3;
        y=4;
        x= y;
        y =5;
        z=5;
        System.out.println("x = " + x);
        System.out.println("y =" + y);
        System.out.println("z = " + z);
        if (x == y)
            System.out.println("x and y equal");
        else
            System.out.println("x and y not equal");
        if (y == z)
            System.out.println("y and z equal");
        else
            System.out.println("y and z not equal");
    }
}
