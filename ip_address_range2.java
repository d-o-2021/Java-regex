//Check if number is in range 200 to 249 
import java.util.*;
import java.util.regex.*;
class case16 
{
    public static void main(String[] args) {
        String s="253";
        Pattern p=Pattern.compile("^([2][0-4]\\d)$");// 200 to 249         [2][0-4]\\d
        Matcher m=p.matcher(s);
        if(m.find())System.out.println("valid");
        else System.out.println("invalid");

    }
    
}
