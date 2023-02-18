import java.util.Scanner;
public class Factorielle {
    public static void main(String[] args) {
        factorielle();
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();

        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;

        }
        System.out.println(n + "! = " + factorielle);
    }
}
