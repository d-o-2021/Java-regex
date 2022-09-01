//Find if string contains atleast one digit or not in a 4 letter word 
import java.util.*;
import java.util.regex.*;
class case18 
{
    public static void main(String[] args) {
        String s="1SS1";
        Pattern p=Pattern.compile("^(?=.*\\d).{4}$");
        // Pattern p=Pattern.compile("^(?=.*[a-zA-Z]).{4}$");//check if alteast one small alphabet is present or not 
        Matcher m=p.matcher(s);
        if(m.find())System.out.println("valid");
        else System.out.println("invalid");

    }
    
}
