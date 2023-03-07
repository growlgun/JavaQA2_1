public class Main {
    public static void main(String[] args) {
        int clientCash = 500;
        int addCash = 3300;
        int bonus = addCash / 100;
        int finalCash = clientCash + addCash + bonus;


        if (addCash > 1000) {

            System.out.println(finalCash);
            System.out.println(bonus);

        } else {
            System.out.println(finalCash);
            System.out.println(bonus = 0);
        }
    }
}