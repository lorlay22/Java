import java.util.Scanner;
public class Carres {
    public static void main(String[] args) {
        carres();
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int a = scanner.nextInt();
        int b = a * a;
        System.out.println("Le carré de " + a + "\t"+" est " + b);

    }
}