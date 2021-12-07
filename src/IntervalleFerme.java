public class IntervalleFerme extends Intervalle {
    @Override
    public boolean contient(int v) { return v >= min & v <= max; }
}
