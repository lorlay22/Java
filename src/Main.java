import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour quel est votre prénom ? " );
        String Prenom = scanner.nextLine();
        System.out.println("Ton prénom est "+ Prenom );
        // quand "main" il doit y avoir static pour que ça fonctionne et "void" car cela ne renvoie rien
        /* System.out.println("Bonjour quel est votre prénom ? " );
        Scanner scanner = new Scanner(System.in); // similaire au inpout en python, permet de rnetrer valeurs
        int unEntier = scanner.nextInt(); //récupère variable
        float unReel = scanner.nextFloat(); // récupère variable
        System.out.println("J’ai recupere un entier: " + unEntier); //affiche phrase + variable dans la console
        System.out.println("J’ai aussi recupere un reel: " + unReel); //affiche phrase + variable dans la console */
    }
}