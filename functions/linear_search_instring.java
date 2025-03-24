import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String name="mango"; 
        char a='o';
        int ans=search(name,a);
        System.out.print("Found at index: " + ans);
        
    }
    static int search(String str,char ch)
    {
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                return i;
            }
        }
        return -1;
        /*
        (or)
        for(char i:str.tocharArray())
        this converts string into character array so we can
        access individual elements
        {
            if(i==ch)
            {
                return true;
            }
        }
        */
    }
}
