
import java.util.Scanner;
public class Egalite {
    public static void main(String[] args) {
        egalitestr();
    }
    public static void egalitestr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez une chaîne de caractère ?");
        String a = scanner.nextLine();
        System.out.println("Saisissez une 2ème chaîne de caractère ?");
        String b = scanner.nextLine();
        if(a.equals(b)){
            System.out.println( ""+a+ " et " +b+ " sont les mêmes");
        }else{
            System.out.println( ""+a+ " et " +b+ " sont différents");
        }

        }
    }