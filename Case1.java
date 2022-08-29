// Print only those Words that starts with a Number
import java.util.*;
import java.util.regex.*;
class imp1 
{
    public static void main(String[] args) 
    {
        String s1="q2M1y 1name 3rajde2v i1s 1m2as 1r1amjiki12 r2a2m";
        Pattern p=Pattern.compile("\\b[0-9]+\\w+\\b");
        Matcher m=p.matcher(s1);
        while(m.find())
        {
            System.out.println(m.group());
        }
    }    
}
//OUTPUT : 
//1name
//3rajde2v
//1m2as
//1r1amjiki12
