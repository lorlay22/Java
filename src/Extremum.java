
import java.util.Scanner;
public class Extremum {
    public static void main(String[] args) {
        max();
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un entier ?");
        int a = scanner.nextInt();
        System.out.println("Choisissez un autre entier ?");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Le nombre " + b + " est le maximum");
        } else if (a > b) {
            System.out.println("Le nombre " + a + " est le maximum");


        }

    }
}
