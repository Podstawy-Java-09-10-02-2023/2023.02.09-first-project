public class App5 {
    public static void main(String[] args) {
        int a = 3;
        if(a > 7) {
            System.out.println("Jest wieksze od 3 !!");
        } else if(a > 5) {
            System.out.println("Jest ujemne !!");
        } else if(a > 3) {
            System.out.println("Jest ujemne 2 !!");
        } else {
            System.out.println("Nie wiadomo co to !!");
        }

        System.out.println("Ostatnia linia !!");

        switch(a) {
            case 1:
                System.out.println("to jest 1 !!!");
                break;
            case 2:
                System.out.println("to jest 2 !!!");
                break;
            case 3:
                System.out.println("to jest 3 !!!");
                break;
            case 4:
                System.out.println("to jest 4 !!!");
                break;
            case 5:
                System.out.println("to jest 5 !!!");
                break;
            default:
                System.out.println("nie wiem co to za liczba !!!");
                break;
        }

        String imie = "Janusz";
        switch (imie) {
            case "Zbyszek":
                System.out.println("cos");
                break;
            case "Waldek":
                System.out.println("cos");
                break;
            case "Janusz":
                System.out.println("cos");
                break;
        }

        System.out.println("Algorytm !!");
        int step = 3;

        switch (step) {
            case 1:
                System.out.println("krok 1");
                break;
            case 3:
                System.out.println("krok 2");
                break;
            case 2:
                System.out.println("krok 3");
                break;
            case 4:
                System.out.println("krok 4");
                break;
        }
    }
}
