package NonGenericClasses;

public class IntegerPair {
    int fst; //first
    int snd; //second
    public IntegerPair(int fst, int snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }
}
