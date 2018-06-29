public class VerbAll extends VerbInfinitive {

    String [] allTranslite;

    public VerbAll(Value value, Translation translation, String[] allTranslite) {
        super(value, translation);
        this.allTranslite = allTranslite;
    }

}
