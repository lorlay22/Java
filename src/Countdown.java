
public class Countdown {
    public static void main(String[] args) {
        countdown();
    }

    public static void countdown() {
        for (int i = 10; i >0; --i) {
            System.out.println(i);
        }
        System.out.println("BOUM!!");
    }
}