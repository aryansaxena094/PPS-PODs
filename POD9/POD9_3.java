import java.util.*;
public class POD9_3 {
    public static int count(ArrayList<String> ch, String a)
    {
        int count = 0;
        for(int i = 0; i < ch.size(); i++)
        {
            if(ch.get(i).equals(a))
            {
                count++;
            }
        }
        return count;
    }
    
    public static int findsub(ArrayList<String> ch, int k)
    {
        int flag = 0;
        ArrayList<Integer> indexlist = new ArrayList<Integer>();
        int ans = 0;
        int index = 0;
        int temp1 = 0;
        int temp2 = 0;

        for(int i = 0; i < ch.size(); i++)
        {
            if(count(ch,ch.get(i))<k)
            {
                flag = 1;
                indexlist.add(i);
            }
        }
        if(flag == 0)
        {
            return ch.size();
        }
        for(int i = 0; i < indexlist.size(); i++)
        {
            index = indexlist.get(i);
            ArrayList<String> t1 = new ArrayList<String>(ch.subList(0, index));
            ArrayList<String> t2 = new ArrayList<String>(ch.subList(index+1, ch.size()));
            temp1 = findsub(t1, k);
            temp2 = findsub(t2, k);
        }

        if(temp1>ans)
        {
            ans = temp1;
        }
        if(temp2>ans)
        {
            ans = temp2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());
        String line1[] = l1.split("");
        ArrayList<String> chr = new ArrayList<String>(Arrays.asList(line1));
        System.out.println(findsub(chr, k));
        sc.close();
    }
}