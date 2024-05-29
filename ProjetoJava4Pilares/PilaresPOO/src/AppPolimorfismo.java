import polimorfismo.*;

public class AppPolimorfismo {
    
    public static void main(String[] args) {
        
        //instanciação de classes filhas, subclasses
        Cachorro cachorro01 = new Cachorro();
        Gato gato01 = new Gato();
        Pato pato01 = new Pato();

        System.out.println("* Cachorro");
        cachorro01.locomover();
        cachorro01.comunicar();
        System.out.println("");

        System.out.println("* Gato");
        gato01.locomover();
        gato01.comunicar();
        System.out.println("");

        System.out.println("* Pato");
        pato01.locomover();
        pato01.comunicar();
        System.out.println("");
    }

}
