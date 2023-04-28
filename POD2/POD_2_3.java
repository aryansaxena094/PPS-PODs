import java.util.*;

public class POD_2_3 {
    public static void main(String[] Args)
    {
        String line1 = "ADOBECODEBANC";
        String line2 = "ABC";
        ArrayList<Integer> ind = new ArrayList<Integer>();
        String ans = "";

        for(int i = 0; i < line2.length(); i++)
        {
            char temp = line2.charAt(i);
            int count = 0;

            for(int j = 0; j < line1.length(); j++)
            {
                char temp2 = line1.charAt(j);

                if(temp == temp2)
                {
                    ind.add(j);
                    count++;
                }
            }

            if(count == 0)
            {
                ind.clear();
                break;
            }
        }
        System.out.println(ind);


    }
    
}
