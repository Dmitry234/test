import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Primer {
    public static void main(String[] args) {
        String text = "a brush, roller, mop can be used to apply the primer ";
        Pattern pattern = Pattern.compile("p....r");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start, end) + " c " + start + " по " + (end - 1) + " позиция ");
        }

        System.out.println(matcher.replaceAll("paint"));
    }

}

