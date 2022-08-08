public class Main {
    public static void main(String[] args) {
        Ucgen ucgen = new Ucgen();
        ucgen.alan();
        ucgen.cevre();

        System.out.println("-------------------------");

        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.alan();
        dikdortgen.cevre();

        System.out.println("-------------------------");

        Kare kare = new Kare();
        kare.alan();
        kare.cevre();

        System.out.println("-------------------------");

        Daire daire = new Daire();
        daire.alan();
        daire.cevre();

    }
}