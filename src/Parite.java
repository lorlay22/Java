
import java.util.Scanner;
public class Parite {
    public static void main(String[] args) {
        parite();
    }
    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un entier ?");
        int a = scanner.nextInt();
        if (a%2==0) {
            System.out.println("Le nombre " + a + " est bien pair");
        }else{
            System.out.println("Le nombre " + a + " est  impair");

        }

    }

}
