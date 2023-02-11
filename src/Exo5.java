import java.util.Scanner;
public class Exo5 {
    public static void main(String[] args) {
        volume();
    }
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + somme);
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextInt();
        float division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale a " + division);
    }
    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur");
        float longueur = scanner.nextFloat();
        System.out.println("Veuillez saisir la largeur");
        float largeur = scanner.nextFloat();
        System.out.println("Veuillez saisir la hauteur");
        float hauteur = scanner.nextFloat();
        float volume = largeur*longueur*hauteur;
        System.out.println("Le volume est " + volume);
    }
}

