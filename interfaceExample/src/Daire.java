public class Daire implements Hesaplama{
    int pi = 3;
    int r = 5;
    @Override
    public void alan() {
        int daire_alan = (r*r)*pi;
        System.out.println("Dairenin alanı: " + daire_alan);
    }

    @Override
    public void cevre() {
        int daire_cevre = 2*(pi * r);
        System.out.println("Dairenin çevresi: " + daire_cevre);
    }
}
