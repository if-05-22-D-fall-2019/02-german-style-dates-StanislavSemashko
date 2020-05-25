import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString)
    {
        final String longDate = "(([0-2][0-9]|3[0-1])(\\.|\\-)(0[0-9]|1[0-2])(\\.|\\-)\\d{4})";
        final String shortDate ="\\d(\\.|-|\\s)\\d(\\.|-|\\s)(\\d{4}|\\d{2})";
        final String regex = "(" + longDate + ")|" + "(" + shortDate + ")";
        Matcher matcher;

        Pattern pattern = Pattern.compile(regex);
        matcher = pattern.matcher(dateString);
        return matcher;
    }
}
