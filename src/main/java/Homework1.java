public class Homework1 {

    public static void main(String[] args) {
        int cenaProcesora = 700; // cena procesora
        int cenaPlyty = 500; // cena plyty
        int cenaPamieci = 300; // cena ram
        int cenaDysk = 400; // cena dysku
        int cenaInne = 500; // cena innych czesci
        final double VAT = 1.23; // narzut podatku VAT


        // Liczymy cene komputera bez monitora
        // Wyrazenie sumujace skladniki, zapisujac
        //jako wyrazenie inicjujace ceneKomputera


        double cenaKomputera = (cenaProcesora + cenaPlyty + cenaPamieci + cenaDysk + cenaInne) * VAT;

        System.out.println("Cena komputera bez monitora wynosi :");
        System.out.println(cenaKomputera);
        int cenaMonitora = 1100; // cena monitora netto
        cenaKomputera = cenaKomputera + cenaMonitora * VAT; // cena komputera z monitorem
        System.out.println("Cena komputera z monitorem wynosi :");
        System.out.println(cenaKomputera);


        int priceCPU = 2000; // czy nazwy własne można zapisywać wielkimi literami
        int priceMOBO = 800;
        int priceRAM = 1600;
        int priceHDD = 500;
        int priceOther = 2000;
        final double VAT2 = 1.23;


        double PricePc = (priceCPU + priceHDD + priceMOBO + priceOther + priceRAM) * VAT2;

        System.out.println("PC price w/o screen is :");
        System.out.println(PricePc);
        int priceScreen = 3100;
        PricePc = PricePc + priceScreen *VAT2;
        System.out.println("PC price with screen is :");
        System.out.println(PricePc);

    }
}
