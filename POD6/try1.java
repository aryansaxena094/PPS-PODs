import java.util.ArrayList;
import java.util.Arrays;

public class try1 {
    public static void main(String[] Args){
        
        String l1 = "app ap p i e ple pp"; 
        String l2 = "apple";
        String line1[] = l1.split(" ");
        ArrayList<Integer> counters = new ArrayList<Integer>();
        ArrayList<String> poss = new ArrayList<String>();
        poss.addAll(Arrays.asList(line1));
        
        for(int i = line1.length-1; i < 20; i++)
        {
            String temp = poss.get(i - (line1.length-1)) + poss.get(i - (line1.length-2));
            poss.add(temp);
            
        }
        System.out.println(poss);
    }
}
