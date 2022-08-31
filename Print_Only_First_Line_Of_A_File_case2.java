// Part 2 : Print only first line of a file
import java.util.*;
import java.io.*;
import java.util.regex.*;

class case8_part2 {
    public static void main(String[] args) {
        try
        {
            // CASE 2
            // Scanner sc=new Scanner(new FileInputStream("xyz.txt"));
            // String s=sc.nextLine();
            
            
            // CASE 3
            // FileReader f=new FileReader("xyz.txt");
            // BufferedReader br=new BufferedReader(f);
            // String s=br.readLine();
            
            // CASE 4
            InputStreamReader ir=new InputStreamReader(new FileInputStream("xyz.txt"));
            BufferedReader br=new BufferedReader(ir);
            String s=br.readLine();

            // CASE 5   FAILS!!!!!
            // FileInputStream fi=new FileInputStream("xyz.txt");
            // BufferedReader br=new BufferedReader(fi);

            System.out.println(s);
        }
        catch(Exception e){}
    }
    
}
