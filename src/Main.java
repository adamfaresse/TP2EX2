public class Main {

    public static void main(String[] args) {
        /*IntervalleOuvert interOuvert = new IntervalleOuvert();
        IntervalleFerme interFerme = new IntervalleFerme();
        Test.testIntervalleOuvert(interOuvert);
        Test.testIntervalleFerme(interFerme);
        Ce code afficher deux fois Test réussi*/

        /*IntervalleOuvert interOuvert = new IntervalleOuvert();
        Test.testIntervalleFerme(interOuvert);
        IntervalleFerme interFerme = new IntervalleFerme();
        Test.testIntervalleOuvert(interFerme);*/
        //Question 4 : Le principe violé est LSP car toute instance de IntervalleOuvert ne peux pas être substituer
        // par une instance de IntervalleFerme
        Intervalle[] intervalles = new Intervalle[5];
        for (int i = 0; i < 5; i++) {
            if (i%2==0) intervalles[i] = new IntervalleOuvert();
            else intervalles[i] = new IntervalleFerme();
            intervalles[i].changerBornes(i*2, i*4+2);

        }
        for (Intervalle intervalle : intervalles)
            System.out.println(intervalle.contient(5));

        //Question 7 : Les lignes ne génerent pas d'erreur à la compilation.
    }
}
