public class Main {
    public static void main(String[] args) {
        int account = 100;
        int deposit = 2000;

        int bonus;
        if (deposit > 1100) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = account + deposit +bonus;

        System.out.println("Итоговая сумма на счете: " + totalAmount + " (в том числе бонус за пополнение: " + bonus + ")");
    }
}
