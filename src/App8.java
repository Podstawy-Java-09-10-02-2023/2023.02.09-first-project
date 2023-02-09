public class App8 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for(int i = 0; i < 10; i++) {
            tab[i] = (i+1)*2;
        }

        /*int value = 1;
        int index = 0;
        while(index < 10) {
            if(value % 2 == 0) {
                tab[index] = value;
                index++;
            }
            value++;
        }*/

        for(int zmienna : tab) {
            System.out.println(zmienna);
        }
    }
}
