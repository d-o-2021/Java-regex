//Check if number is in range 1900 to 2099 
import java.util.*;
import java.util.regex.*;
class case14 
{
    public static void main(String[] args) {
        String s="2091";
        Pattern p=Pattern.compile("^(([1][9]|[2][0])\\d{2})$");// 1900 to 2099     [1][9]\\d{2}    [2][0]\\d{2}
        Matcher m=p.matcher(s);
        if(m.find())System.out.println("valid");
        else System.out.println("invalid");

    }
    
}
//for year
