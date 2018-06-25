public interface Verb extends Word {

    void setValue(String verbValue);
    String getValue();

    void setTranslation(String verbTranslation);
    String getTranslation();

    String returnRealTranslite(Pronoun pronoun);
}
