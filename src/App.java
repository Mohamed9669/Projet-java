import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        // Bien bien = saisieBien();
        // Bien b2 = saisieBien();
        // afficherBien(bien);
        // afficherBien(b2);

        saisirNBien(2);
    }

    public static Bien saisieBien() {
        Bien bien = new Bien();
        System.out.println("Id du bien: ");
        bien.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Superficie: ");
        bien.setSuperficie(sc.nextDouble());
        sc.nextLine();

        System.out.println("Adresse: ");
        bien.setAdresse(sc.nextLine());

        System.out.println("Description: ");
        bien.setDescription(sc.nextLine());

        return bien;
    }

    public static void afficherBien(Bien bien) {
        System.out.println(bien.toChaine()+"\n\n");
    }

    public static void saisirNBien(int n) {
        Bien bien[] = new Bien[n];
        for (int i = 0; i < n; i++) {
            bien[i] = saisieBien();
            afficherBien(bien[i]);

        }
    }
}
