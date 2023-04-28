import java.util.*;

public class POD10_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        ArrayList<String> ch = new ArrayList<String>(Arrays.asList(l1.split("")));
        ArrayList<String> pallindrome = new ArrayList<String>();
        Collections.sort(ch);
        int count = 0;
        
        for(int i = 0; i < ch.size(); i++)
        {
            String s1 = ch.get(i);
            ch.remove(i);
            if(ch.contains(s1))
            {
                ch.remove(s1);
                pallindrome.add(s1);
                if(i > 0)
                {
                    i = i - 2;
                }
                else
                {
                    i = 0;
                }
            }
            else
            {
                ch.add(i,s1);
            }
        }
        count = (pallindrome.size()*2);
        if(ch.isEmpty()!=true)
        {
            count++;
        }
        System.out.println(count);
        sc.close();
    }   
}
