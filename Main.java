public class Main {

    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("2026-001", "Awa");
        Etudiant e2 = new Etudiant("2026-002");

        Module m1 = new Module("JAVA", "Programmation Java", 2.0);
        Module m2 = new Module("ALGO", "Algorithmique");

        Note n1 = new Note(e1, m1, 17.5);
        System.out.println(n1);

        try {
            Note n2 = new Note(e2, m2, 25);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("BILAN TD2: Etudiants créés: "
                + Etudiant.getCompteur()
                + " Dernière note: "
                + n1.getValeur()
                + "/20 Points (coeff): "
                + n1.points());
    }
}