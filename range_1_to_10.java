//Check number is range 1 to 10 inclusive  
// eg1 : 09 or 9 both are valid , 
// eg2 : 0 is invalid , 
// eg3 : 10 is valid , 
import java.util.regex.*;
import java.util.*;
class case11 
{
    public static void main(String[] args) {
     String s="09";
    //  String s2="10 1 2 3 4 5 6 7 8 9 0 01 02 03 04 044 055 05 05 06 000001 12 12 11 10 10 01 02 7";

     Pattern p=Pattern.compile("\\b((0?[1-9])|10)\\b");         // CASE 1
    //  Pattern p=Pattern.compile("^([1-9]|(0[1-9])|10)$");      // CASE 2
     Matcher m=p.matcher(s);
     if(m.find())System.out.println("Valid");
     else System.out.println("Notvalid");
     
    //  Matcher m=p.matcher(s2);
      //  while(m.find())System.out.println(m.group());    print all numbers in range 1 to 10
    }
    
}
