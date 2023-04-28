import java.util.*;

public class POD7_2 {
    public static void main(String[] Args)
    {
        Scanner sc  = new Scanner(System.in);
        String  l1 = sc.nextLine();
        String l2 = sc.nextLine();

        String line1[] = l1.split(" ");
        String line2[] = l2.split(" ");
        int[] nums = new int[line2.length];
        
        int n = Integer.parseInt(line1[0]);
        int target = Integer.parseInt(line1[1]);
        boolean ans  = false;
        int sum  = 0;

        for(int i = 0; i < n; i++)
        {
            nums[i] = Integer.parseInt(line2[i]);
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                sum = nums[i] + nums[j];
                if(sum == target && i != j)
                {
                    ans = true;
                    break;
                }
            }
            if(ans == true)
            {
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
