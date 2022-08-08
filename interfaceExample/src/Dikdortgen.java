public class Dikdortgen implements Hesaplama{
    int a = 4;
    int b = 6;
    @Override
    public void alan() {
        int dikdortgen_alan = a*b;
        System.out.println("Dikdortgenin alanı: " + dikdortgen_alan);
    }

    @Override
    public void cevre() {
        int dikdortgen_cevre = 2*(a+b);
        System.out.println("Dikdortgenin cevresi: " + dikdortgen_cevre);
    }
}
