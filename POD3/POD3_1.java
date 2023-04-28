import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class POD3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String l2 = sc.nextLine();
        String line1 = l1.substring(1,l1.length()-1);
        String line2 = l2.substring(1,l2.length()-1);
        String cust[] = line1.split(" ");
        int count = 0;
        String blacklist[] = line2.split(" ");
        for(int i = 0; i < blacklist.length; i++)
        {
            int temp = 0;
            String a = blacklist[i].replace("*", ".");
            for(int j = 0; j < cust.length; j++)
            {
                String b = cust[j];
                Pattern pat = Pattern.compile(a);
                Matcher mat = pat.matcher(b);
                boolean m = mat.matches();
                if(m == true)
                {
                    temp++;
                }
            }
            if(count == 0)
            {
                count = count+temp;
            }
            else
            {
                count = count*temp;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
