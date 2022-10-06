public class Part3 {
    public static void main(String[] args) {

        System.out.println("Task Number 1");

        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц  " + i + "  , сумма накоплений равна  " + total + "  рублей");
        }


            System.out.println("Task Number 2");

int totalSum =0;
            for (int i = 1; i <= 12; i++) {
                int amountPerMonth = deposit + deposit/ 100;
                totalSum= totalSum +amountPerMonth;
                System.out.println("Месяц  " + i + "  , сумма накоплений равна  " + totalSum + "  рублей");
            }
        }
    }