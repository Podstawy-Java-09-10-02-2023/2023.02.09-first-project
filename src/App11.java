public class App11 {
    public static void main(String[] args) {
        Client[] clients = new Client[100];

        int i = 5;
        Client c = new Client();
        Client c2 = new Client();

        c.name = "Janusz";
        c.surname = "Kowalski";
        System.out.println(c.name);

        c2.name = "Zbyszek";
        c2.surname = "Malinowski";
        System.out.println(c2.name);

        Client c3 = c;

        System.out.println(c3.name);

        c3.name = "Wiesiek";

        System.out.println(c3.name);
        System.out.println(c.name);

        clients[0] = new Client();
        clients[0].name = "Wlodek";

        clients[1] = new Client();
        clients[1].name = "Zygfryd";

        clients[1].age = 30;
        clients[1].pesel = 123123123123L;
    }
}
