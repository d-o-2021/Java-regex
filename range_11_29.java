//Check if number is in range 11 to 29 
import java.util.*;
import java.util.regex.*;
class case12 
{
    public static void main(String[] args) {
        String s="20";
        Pattern p=Pattern.compile("^([1][1-9]|[2]\\d)$");// 11 to 29     1[1-9] or 2[1-9]
        // "^([3][0-1])$"     30n or 31 only
        Matcher m=p.matcher(s);
        if(m.find())System.out.println("valid");
        else System.out.println("invalid");

    }
    
}
