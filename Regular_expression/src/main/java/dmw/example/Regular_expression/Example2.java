package dmw.example.Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
    public static void main(String[]args){
        Pattern pattern=Pattern.compile("[abc]");
        Matcher matcher=pattern.matcher("a7b@z#9");
        while (matcher.find())
        {
            System.out.println(matcher.start()+"..."+matcher.group());
        }
    }
}
