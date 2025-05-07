package dmw.example.Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[]args)
    {
        Pattern pattern= Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaaaaab");
        boolean matches = matcher.matches();
        System.out.println("result:"+matches);


// second method
//        Pattern.matches("a+b*","abb");
    }
}
