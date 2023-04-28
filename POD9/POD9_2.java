import java.util.*;
public class POD9_2 {  
    public static String toChars(ArrayList<Integer> a)
    {
        String ans = "";
        String chars = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < a.size(); i++)
        {
            if(a.get(i)<27)
            {
                ans = ans + chars.charAt(a.get(i));
            }
            else
            {
                return null;
            }
        }
        return ans;
    }
    public static void recur(ArrayList<Integer> nums, ArrayList<String> ans)
    {
        for(int i = 0; i < nums.size()-1; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.addAll(nums);
            String a = temp.get(i) +""+ temp.get(i+1);
            temp.set(i, Integer.parseInt(a));
            temp.remove(i+1);
            String c = toChars(temp);
            if(ans.contains(c) != true)
            {
                ans.add(toChars(temp));
            }
            recur(temp,ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String line1[] = l1.split("");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<String> ans = new ArrayList<String>();
        for(int i = 0; i < line1.length; i++)
        {
            if((i != line1.length-1) && line1[i+1].equals("0"))
            {
                nums.add(Integer.parseInt(line1[i])*10);
                i++;   
            }
            else
            {
                nums.add(Integer.parseInt(line1[i]));
            }
        }
        if(nums.contains(0)!=true)
        {
            ans.add(toChars(nums));
            recur(nums,ans);
            ans.remove(null);
        }
        int answer = ans.size();
        System.out.println(answer);
        sc.close();
    }    
}