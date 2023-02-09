public class App10 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for(int row = 0; row < 10; row++) {
            for(int column = 0; column < 10; column++) {
                tab[row][column] = row * column;
                System.out.print(tab[row][column] + " ");
            }
            System.out.println();
        }

        App11[] tab2 = new App11[100];
    }
}
