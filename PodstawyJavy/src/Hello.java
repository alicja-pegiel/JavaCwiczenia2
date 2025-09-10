public class Hello {
    public static void main(String[] args) {
        // To jest komentarz
        System.out.println("Hello World");
        // Komentowanie wielu linii - ctrl + /
        /*
        Tu mogę pisać
        I każda nowa linijka
        Też jest w komentarzu
         */
        int a = 5, b = 2;
        System.out.println("Wynik dodawania: " + (a + b));
        System.out.println(a + b + " to wynik dodawania");
        float wynik;
        wynik = (float) a/b;
        System.out.println(wynik);
    }
}
