package pakiet1;

import pakiet1.Pojazd;

public class Pojazd {
    private String name = "auto";
    int iloscKol = 4;
    protected boolean elektryczny = false;
    public String marka= "audi";

    public void pokazNaEkranie(){
        Pojazd pojazd = new Pojazd();
        System.out.println(name);
        System.out.println(iloscKol);
        System.out.println(elektryczny);
        System.out.println(marka);
    }

}

