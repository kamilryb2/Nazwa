public class Main    {
    public static void main(String[] args) {
        boolean UrodzilemSiewPierwszejPolowieRoku = false;
        char Litera = 'K';
        byte Komputer = 14;
        short ChrzestPolski = 966;
        int IleLudziByloW1930Roku = 2000000000;
        long IleJestObecnieLudzi = 76000000000L;
        double e = 2.718281828459;
        float pi = 3.14159265358979323846264338327950288419716939937510582097494459230781640628f;

        System.out.println(UrodzilemSiewPierwszejPolowieRoku);
        System.out.println(Litera);
        System.out.println(Komputer);
        System.out.println(ChrzestPolski);
        System.out.println(IleLudziByloW1930Roku);
        System.out.println(IleJestObecnieLudzi);
        System.out.println(e);
        System.out.println(pi);

        int ileBitow = 233;
        System.out.println(ileBitow);

        Car samochod = new Car();
        samochod.speed = 120;
        System.out.println(samochod.speed);
        samochod.skrecWLewo();
        samochod.skrecWPrawo();
        samochod.otwórzSzyberdach();
        samochod.jedzNaprzod();
    }


}
