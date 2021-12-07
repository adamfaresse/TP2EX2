public abstract class Intervalle {
    public int min, max;
    public void changerBornes(int min, int max) {
        this.min = min; this.max = max;
    }
    public abstract boolean contient(int v);
}
