import java.util.*;
public class POD6_1 {
    public static void recur(ArrayList<String> ch, ArrayList<Integer> counts, String temp, int count, String l2)
    {
        String oldtemp = temp;
        for(int i = 0; i < ch.size(); i++)
        {
            temp = temp + ch.get(i);
            count = count + 1;
            if(temp.equals(l2))
            {
                counts.add(count);
                break;
            }
            else if(temp.length() < l2.length())
            {
                if(l2.substring(0, temp.length()).equals(temp))
                {
                    recur(ch, counts, temp, count, l2);
                }
            }
            temp = oldtemp;
            count = count - 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine(); 
        String l2 = sc.nextLine();
        ArrayList<String> ch = new ArrayList<String>(Arrays.asList(l1.split(" ")));
        ArrayList<Integer> counts = new ArrayList<Integer>();
        String temp = "";
        int count = 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < ch.size(); i++)
        {
            temp = temp + ch.get(i);
            count = count + 1;
            if(temp.equals(l2))
            {
                counts.add(count);
                break;
            }
            else if(temp.length() < l2.length())
            {
                recur(ch, counts, temp, count, l2);
            }
            else
            {
                break;
            }
            temp = "";
            count = count - 1;
        }
        if(counts.size() > 0)
        {
            for(int i = 0; i < counts.size(); i++)
            {
                ans = Math.min(ans, counts.get(i));
            }
        }
        else
        {
            ans = -1;
        }
        System.out.println(ans);
        sc.close();
    }
}
