import javax.swing.*;

public class Seasons {
    enum Season{ winter, sprin, summer, fall};
    public static String describe(Season p) {
        int nr = p.ordinal() + 1;
        String txt = p +" (has number" + nr +")";
        if (p == Season.winter) return txt + " - its snowy";
        if (p == Season.sprin) return  txt + "flowers r born";
        if (p == Season.summer) return txt + " its hot";
        if (p == Season.fall) return  txt + " its rainy";
        return "its not possible";
    }
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("insert season");
        Season p = Season.valueOf(name);
        JOptionPane.showMessageDialog(null, describe(p));
    }
}
