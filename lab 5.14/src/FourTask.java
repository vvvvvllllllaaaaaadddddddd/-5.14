import java.util.Scanner;

public class FourTask {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть першу назву імені: ");
        s1 = sc.nextLine();
        System.out.println("Введіть другу назву імені: ");
        s2 = sc.nextLine();
        System.out.println();
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Введені назви індентичні");
        } else {
            System.out.println("Назви різні");
        }
    }
}
