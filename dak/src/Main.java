public class Main {

    public static void main(String[] args) {

    Duck kaczka1 = new Duck("duffy");
    Duck kaczka2 = new Duck("drugi");
    Duck kaczka3 = new Duck("trzeco");
    Duck kaczka4 = new Duck("czwarty"){
      void jakLatam(){
          System.out.println("I am flying like swam");
      }
    };
    kaczka1.jakLatam();
kaczka4.jakLatam();
    }

}
