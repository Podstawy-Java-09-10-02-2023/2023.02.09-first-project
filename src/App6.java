import java.util.Random;

public class App6 {
    public static void main(String[] args) {
        int[] tab = new int[100];

        for(int i = 0; i < 100; i++) {
            tab[i] = i;
        }

        for(int element : tab) {
            element = 5;
        }

        /*for(int element : tab) {
            System.out.println(element);
        }*/

        int i = 0;
        while(i < 100) {
            System.out.println("Petla dziala !!");
            i = new Random().nextInt(120);
        }

        /*do {
            System.out.println("Petla dziala !!");
            tab[i] = i;
            System.out.println(tab[i]);
            i++;
        } while (i < 100);*/

        System.out.println("Po petli !!!");
    }
}
