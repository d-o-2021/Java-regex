//Check if number is in range 250 to 255 
import java.util.*;
import java.util.regex.*;
class case17 
{
    public static void main(String[] args) {
        String s="255";
        Pattern p=Pattern.compile("^([2][5][0-5])$");// 250 to 255     [2][5][0-5]
        Matcher m=p.matcher(s);
        if(m.find())System.out.println("valid");
        else System.out.println("invalid");

    }
    
}
