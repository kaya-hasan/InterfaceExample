public class Ucgen implements Hesaplama{
    int a = 5;
    int b = 6;
    int c = 7;
    @Override
    public void alan() {
        int ucgen_alan = (a + b + c)/2;
        System.out.println("Üçgenin alanı: " + ucgen_alan);
    }

    @Override
    public void cevre() {
        int ucgen_cevre = (a + b + c);
        System.out.println("Üçgenin çevresi: " + ucgen_cevre);
    }
}
