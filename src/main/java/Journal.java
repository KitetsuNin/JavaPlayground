public class Journal extends Publication {
    private int number;
    public Journal (int num, String tit, String pub, int y, String id, double price, int quant){
       super (tit, pub, y, id, price, quant);
       number = num;
    }
    public int getNumber(){
        return number;
    }

}
