public class App2 {
    public static void main(String[] args) {
        int a = 13;
        int b = 7;

        double wynik = ((double) a) / ((double) b);

        System.out.println(wynik);

        double liczba = 5.5;
        int libcza2 = (int) liczba;

        System.out.println(libcza2);

        int liczba3 = 5;
        double liczba4 = liczba3;

        /*int x = 5;
        String s = (String) x;*/

        System.out.println(liczba4);

        int x1 = 5;
        int x2 = 3;

        int wynik2 = x1 % x2;

        System.out.println(wynik2);

        String imie = "Janusz";
        String nazwisko = "Kowalski";

        String wynik3 = imie + " " + nazwisko;

        System.out.println(wynik3);

        int i1 = 5;
        int i2 = 7;

        boolean wynikLogiczny = i1 != i2;

        System.out.println(wynikLogiczny);

        boolean logiczna1 = true;
        boolean logiczna2 = false;

        System.out.println(logiczna1 || logiczna2);

        System.out.println(!logiczna1);
    }
}
