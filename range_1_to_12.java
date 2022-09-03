//Check if number is in range 1 to 12 
import java.util.*;
import java.util.regex.*;
class case13 
{
    public static void main(String[] args) {
        String s="08";
        Pattern p=Pattern.compile("^(0?[1-9]|[1][0-2])$");// 1 to 12     9 or 09 or 10 or 11 or 12 valid
        Matcher m=p.matcher(s);
        if(m.find())System.out.println("valid");
        else System.out.println("invalid");

    }
    
}
