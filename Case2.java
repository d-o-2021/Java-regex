//print only those word which include numbers except numbers in range [1,6]
import java.util.regex.*;
class case7 
{
    public static void main(String[] args) 
    {
        String str="ramji167 7ramen zoro 70 8luffy 9090 O@09#";
        Pattern p=Pattern.compile("\\b[^1-6 ]+\\b?");
        // Pattern p=Pattern.compile("\\b[^1-6a-zA-Z@#$%^&*()~`{}|;:/\'\".,<>?' ]+\\b");// only numbers  
        Matcher m=p.matcher(str);
        while(m.find())System.out.println(m.group());
    }
}
//o/p
// 7ramen
// zoro
// 70
// 8luffy
// 9090
// O@09#
