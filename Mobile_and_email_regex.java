//Read Only 10 digit Indian Mobile number(Generally starts with 6/7/8/9) From a file and display them using regex 
import java.util.regex.*;
import java.io.FileReader;
import java.util.*;
class case10 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(new FileReader("abc.txt"));
        String s=sc.nextLine();
        Pattern p=Pattern.compile("\\b[6-9]\\d{9}\\b");
        // Pattern p=Pattern.compile("\\b(\\w{4,16}@(gmail|yahoo).(com|co.in))\\b");//fetch only valid emails from file and print them
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
