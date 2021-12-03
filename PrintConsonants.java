package javafirst;
import java.util.Scanner;
public class PrintConsonants
{   
    public static String remVowel(String str)
    {
         return str.replaceAll("[aeiouAEIOU]", "");
    }
     
    // Driver Code
    public static void main(String[] args)
    {
        String str = "MynameisRamakrishna";       
        System.out.println(remVowel(str));
    }
}

//input : MynameisRamakrishna