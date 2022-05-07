import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Для виконання програми введіть три дробові числа");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
            System.out.println("Введіть друге число: ");
            b = sc.nextDouble();
            System.out.println("Введіть третє число: ");
            c = sc.nextDouble();
            System.out.println();
            if (a > b && a > c) {
                System.out.println(a + " - найбільше дробове число");
            } else if (b > a && b > c) {
                System.out.println(b + " - найбільше дробове число");
            } else if (c > a && c > b) {
                System.out.println(c + " - найбільше дробове число");
            } else {
                System.out.println("Найбільшого дробового числа нема((");
            }
        } else {
            System.out.println("Ви ввели не дробове число");
        }

    }

}
