package day57.HashMap.src;
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(sanitizedString(abbreviation), sanitizedString(explanation));
    }

    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        return this.abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);

        if (this.abbreviations.containsKey(abbreviation)) {
            return this.abbreviations.get(abbreviation);
        } else {
            return null;
        }
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
    
        string = string.toLowerCase();
        return string.trim();
    }
}
