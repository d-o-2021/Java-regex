//Print only 1st line of a file******
// CASE 1
import java.util.regex.*;
import java.io.FileInputStream;
import java.util.*;
import java.util.regex.*;
class case8 
{
    public static void main(String[] args) {
        String str="";
        try
        {
            FileInputStream fi=new FileInputStream("xyz.txt");
            boolean flag=true;
            while(flag)
            {
                int i=fi.read();
                if(i<0)flag=false;
                str+=(char)i;
            }
        }
        catch(Exception e){}
        Pattern p=Pattern.compile("[^\\n]+");
        Matcher m=p.matcher(str);
        if(m.find())System.out.println(m.group());
        else System.out.println("null");
    }
}
