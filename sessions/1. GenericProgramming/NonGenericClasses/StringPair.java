package NonGenericClasses;

public class StringPair {
    String fst; //first
    String snd; //second
    public StringPair(String fst, String snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }
}
