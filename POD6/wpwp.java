import java.util.*;
import java.util.regex.*;
public class wpwp {
    public static void main(String[] Args){
        
        String l1 = "app ap p i e ple pp"; 
        String l2 = "apple";
        String line1[] = l1.split(" ");
        ArrayList<Integer> counters = new ArrayList<Integer>();
        for(int i = 0; i < line1.length; i++)
        {
            int count = 1; 
            int j = 0;
            String curword = line1[i];
            String temp = "";
            while(j < line1.length){
                String followed = line1[j];
                temp = curword + followed;
                Pattern pat = Pattern.compile(temp);
                Matcher mat = pat.matcher(l2);
                boolean a = mat.find();
                if(a == true)
                {
                    count++;
                    j--;
                    curword = curword+followed;
                }
                else
                {
                    j++;
                }
            }
            if(l2.equals(curword))
            {counters.add(count);}
        }
        System.out.println(counters);
    }
}
