public class Bonus {
    public static void main(String[] args) {
        int account = 100;
        int insertion = 1500;
        int bonus;

        if (insertion > 1000) {
            bonus = insertion / 100;
        } else {
            bonus = 0;
        }
        int sum = account + insertion + bonus;
        System.out.println("Бонус составляет:" + bonus + " руб.");
        System.out.println("Общий счёт составляет:" + sum + " руб.");
    }
}
