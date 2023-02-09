import java.util.List;

public class App4 {
    public static void main(String[] args) {
        String[] tablicaImion = new String[10];
        int[] tablicaLiczb = new int[10];

        tablicaLiczb[0] = 5;
        tablicaLiczb[1] = 7;
        tablicaLiczb[2] = 10;

        System.out.println(tablicaLiczb[1]);
        System.out.println(tablicaLiczb[5]);

        System.out.println(tablicaImion[3]);

        int[][] tablica2D = new int[10][10];
        tablica2D[1][1] = 10;

        int[][][] tablica3D = new int[10][7][5];

        int[][] a = new int[5][5];
        a[3][3] = 5;

        System.out.println(a);

        double[] tab = {3.4, 5.5, 7.7, 12.12, 435.34111};

        System.out.println(tab[0]);
    }
}
