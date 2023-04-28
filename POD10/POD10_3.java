import java.util.*;

public class POD10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l0 = sc.nextLine();
        String l1 = sc.nextLine();
        ArrayList<String> nums = new ArrayList<String>(Arrays.asList(l1.split(" ")));
        Collections.sort(nums);
        int count = 0;
        int fc = 0;
        int n = 0;
        if(nums.size()>2)
        {
            for(int i = 1; i < nums.size(); i++)
            {
                if(nums.get(i).equals(nums.get(i-1)))
                {
                    count++;
                    if(count > fc)
                    {
                        fc = count;
                        n = Integer.parseInt(nums.get(i));
                    }
                }
                else
                {
                    count = 1;
                }
            }
        }
        else
        {
            n = Integer.parseInt(nums.get(0));
        }
        System.out.println(n);
    }
    
}
