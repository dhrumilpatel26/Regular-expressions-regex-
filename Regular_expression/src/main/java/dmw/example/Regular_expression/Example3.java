package dmw.example.Regular_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {
    public static void main(String[]args) {
        Pattern pattern = Pattern.compile("@(.*?)\\.");
        Matcher matcher = pattern.matcher("hello@dhrumil.hello@vivek.end");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
