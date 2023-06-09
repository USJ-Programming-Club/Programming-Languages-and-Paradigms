package GenericClasses;

public class Pair <T> {
    T fst; //first
    T snd; //second
    public Pair(T fst, T snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }
}
