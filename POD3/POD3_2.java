import java.util.*;

public class POD3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String l1 = sc.nextLine();
        String line1[] = l1.split(",");
        int nums[] = new int[line1.length];
        int peak = 0;
        int index = 0;

        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(line1[i]);
        }
        for(int i = 2; i < (n-2); i++)
        {
            int current = Math.max(Math.abs(nums[i] - nums[i-1]), Math.abs(nums[i+1]-nums[i]));
            if(peak == current)
            {
                if(nums[i] > nums[index])
                {
                    index = i;
                }
            }
            else
            {
                index = i;
            }
            peak = Math.max(peak, current);
        }
        if(peak == 0)
        {
            index = -1;
        }
        System.out.println(index);
        sc.close();
    }
}
