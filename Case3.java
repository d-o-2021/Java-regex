// Search for all Word which starts with An alphbet and of length 14 from file
import java.io.FileReader;
import java.util.regex.*;
import java.util.*;
class case9 
{
    public static void main(String[] args){
        Scanner sc=null;
        try{sc=new Scanner(new FileReader("xyz.txt"));}
        catch(Exception e){}
        
        String s=sc.nextLine();
        Pattern p=Pattern.compile("\\b([a-zA-Z]\\w{13})");//finds all Word which starts with An alphbet and of length 14
        while(s!=null)
        {
            Matcher m=p.matcher(s);
            while(m.find())
            {
                System.out.println(m.group());
            }
            s=sc.nextLine();
        }
    }    
}
