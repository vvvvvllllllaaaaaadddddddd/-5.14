import java.util.Scanner;

public class FiveTask {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перший рядок: ");
        s1 = sc.nextLine();
        System.out.println("Введіть другий рядок: ");
        s2 = sc.nextLine();
        System.out.println();
        if (s1.length() > s2.length()) {
            System.out.println("Найбільший рядок за кількістю символів: " + s1);
        }else {
            System.out.println("Найбільший рядок за кількістю символів: " + s2);
        }
    }
}
