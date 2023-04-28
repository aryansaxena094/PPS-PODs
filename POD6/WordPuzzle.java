import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordPuzzle {
    public static void main(String[] Args){

        String l1 = "app ap p i e ple pp"; 
        String l2 = "apple";
        String line1[] = l1.split(" ");
        ArrayList<Integer> counters = new ArrayList<Integer>();
        for(int i = 0; i < line1.length; i++)
        {
            int count = 0; 
            int j = i;
            String curword = line1[i];
            while(j < line1.length){
                String followed = line1[j];
                String temp = curword + followed;
                Pattern pat = Pattern.compile(temp);
                Matcher mat = pat.matcher(l2);
                boolean a = mat.find();
                if(a == true)
                {
                    count++;
                    j--;
                }
                else
                {
                    j++;
                }
            }
            counters.add(count);
        }
    }
}
