import java.util.*;

public class POD8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String l2 = sc.nextLine();
        String line1[] = l1.split(" ");
        String line2[] = l2.split(" ");
        int n = Integer.parseInt(line1[0]);
        int target = Integer.parseInt(line1[1]);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int count = 0;
        int iter = 0;

        for(int i = 0; i < n; i++)
        {
            nums.add(Integer.parseInt(line2[i]));
        }
        while(target != 0)
        {
            int left = nums.get(0);
            int right = nums.get(nums.size()-1);
            int temp1 = target - left;
            int temp2 = target - right;
            if(temp1 >= 0 && (temp1 < temp2 || temp2 < 0))
            {
                nums.remove(0);
                target = target - left;
                count++;
            }
            else if(temp2 >= 0 && (temp2 < temp1 || temp1 < 0))
            {
                nums.remove(nums.size()-1);
                target = target - right;
                count++;
            }
            else if(temp1 < 0 && temp2 < 0)
            {
                count = -1;
                break;
            }
            else if(temp1 == temp2 && temp1 >= 0 && temp2 >= 0)
            {
                if(nums.get(1) > nums.get(nums.size()-2))
                {
                    nums.remove(0);
                    target = target - left;
                    count++;
                }
                else if(nums.get(1) < nums.get(nums.size()-2))
                {
                    nums.remove(nums.size()-1);
                    target = target - right;
                    count++;
                }
                else
                {
                    nums.remove(0);
                    target = target - left;
                    count++;
                }
            }
            iter++;
            if(iter > n)
            {
                count = -1;
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}