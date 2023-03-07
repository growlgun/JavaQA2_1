public class Main {
    public static void main(String[] args) {
        int clientCash = 500;
        int addCash = 3000;
        int finalCash = clientCash + addCash;
        int bonus = addCash / 100;

        if (addCash > 1000) {

            System.out.println(finalCash);
            System.out.println(bonus);

        } else {
            System.out.println(finalCash);
            System.out.println(bonus = 0);
        }
    }
}