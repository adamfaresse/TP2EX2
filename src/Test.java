public class Test {
    public static void testIntervalleOuvert(Intervalle inter) {
        inter.changerBornes(2,6);
        if (inter.contient(2) || inter.contient(6))
            System.out.println("Ce n’est pas un intervalle ouvert.");
        else System.out.println("Test réussi.");
    }
    public static void testIntervalleFerme(Intervalle inter) {
        inter.changerBornes(2,6);
        if (!inter.contient(2) || !inter.contient(6))
            System.out.println("Ce n’est pas un intervalle fermé.");
        else System.out.println("Test réussi.");
    }
}

