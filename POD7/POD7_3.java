import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class POD7_3 {
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean ans  = false;
        if(s.length() == t.length())
        {
            char[] a = new char[s.length()];
            char[] b = new char[t.length()];
            for(int i = 0; i < s.length(); i++)
            {
                a[i] = s.charAt(i);
                b[i] = t.charAt(i);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int count = 0;
            for(int i = 0 ; i < s.length(); i++)
            {
                if(a[i] == b[i])
                {
                    count++;
                }
            }
            if(count == s.length())
            {
                ans = true;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
