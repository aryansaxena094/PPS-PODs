import java.util.*;

public class cookies {
    
    public static ArrayList<Integer> sumLeft(ArrayList<Integer> arr)
    {
        int sum = 0; 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = arr.size()-1; i >= 0; i--)
        {
            sum = sum + arr.get(i);
            ans.add(sum);
        }
        return ans;
    }
    public static ArrayList<Integer> sumRight(ArrayList<Integer> arr)
    {
        int sum = 0; 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < arr.size(); i++)
        {
            sum = sum + arr.get(i);
            ans.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String arr[] = l1.split(" ");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        ArrayList<Integer> finalans = new ArrayList<Integer>();
        int count = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            nums.add(Integer.parseInt(arr[i]));
        }
        
        if(nums.size()>1)
        {
            nums2.add(nums.get(nums.size()-1));
            nums.remove(nums.size()-1);
        }
        while(count < (arr.length-1))
        {
            ArrayList<Integer> sum_l = sumLeft(nums);
            ArrayList<Integer> sum_r = sumRight(nums2);
            for(int i = 0; i < sum_l.size() ; i++)
            {
                if(sum_r.contains(sum_l.get(i)))
                {
                    finalans.add(sum_l.get(i));
                }
            }
            int temp = nums.get(nums.size()-1);
            nums2.add(0,temp);
            nums.remove(nums.size()-1);
            count++;
        }
        int ans = 0;
        if(finalans.size()>0)
        {
            Collections.sort(finalans);
            ans = finalans.get(finalans.size()-1);
        }
        System.out.println(ans);
        sc.close();
    }
}