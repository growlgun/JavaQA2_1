public class Main {
    public static void main(String[] args) {
        int clientCash = 100;
        int addCash = 1100;
        int bonus = addCash / 100;
        //int finalCash = clientCash + addCash + bonus;


        if (addCash > 1000) {

            System.out.println(clientCash + addCash + bonus);
            System.out.println(bonus);

        } else {
            System.out.println(clientCash + addCash);
            System.out.println(bonus = 0);
        }
    }
}