package dmw.example.Regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {
    public static void checkRE(String re,String str){
        Pattern pattern=Pattern.compile(re);
        Matcher macher=pattern.matcher(str);
        boolean matches = macher.matches();
        System.out.println(matches);
    }
    public static void main(String[]args){
        while (true){
            System.out.println("Enter the regular expression");
            Scanner scanner=new Scanner(System.in);
            String re= scanner.nextLine();
            System.out.println("Enter the your String");
            String str=scanner.nextLine();
            checkRE(re,str);
            System.out.println("exit[y/n]");
            String choice =scanner.nextLine();
            if(choice.equalsIgnoreCase("y")){
                break;
            }
        }
    }
}
