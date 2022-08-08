public class Kare implements Hesaplama{
    int a = 6;
    @Override
    public void alan() {
        int kare_alan = a*a;
        System.out.println("Karenin alanı: " + kare_alan);
    }

    @Override
    public void cevre() {
        int kare_cevre = a*4;
        System.out.println("Karenin cevresi: " + kare_cevre);
    }
}
