//Check if number is in range 0 to 199 
import java.util.*;
import java.util.regex.*;
class case15 
{
    public static void main(String[] args) {
        String s="001";
        Pattern p=Pattern.compile("^([01]?\\d{2})$");// 0 to 199     i.e 001 002 011 022 012 021 032 099 100 199 all valid
        Matcher m=p.matcher(s);
        if(m.find())System.out.println("valid");
        else System.out.println("invalid");

    }
    
}
