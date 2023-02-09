import java.util.Random;

public class App9 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        int toFind = 12;

        Random losowacz = new Random();
        for (int i = 0; i < 10; i++) {
            tab[i] = losowacz.nextInt(101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        boolean found = false;
        for(int element : tab) {
            if(element == toFind) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Jest !!!" : "Brak !!!");
        /*if(found) {
            System.out.println("Jest !!!");
        } else {
            System.out.println("Brak !!!");
        }*/
    }
}
