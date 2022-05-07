import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        String a, b, c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше слово: ");
        a = sc.nextLine();
        System.out.println("Введіть друге слово: ");
        b = sc.nextLine();
        System.out.println("Введіть третє слово: ");
        c = sc.nextLine();
        System.out.println("Введіть четверте слово: ");
        d = sc.nextLine();
        System.out.println("Введіть п'яте слово: ");
        e = sc.nextLine();
        System.out.println();
        String k  = a.concat(" ").concat(b).concat(" ").concat(c).concat(" ").concat(d).concat(" ").concat(e).concat(".");
        System.out.println(k);
    }
}
