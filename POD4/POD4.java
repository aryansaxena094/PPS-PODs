import java.util.*;
public class POD4 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        
        String line1m = line1.substring(1, line1.length()-1);
        String line2m = line2.substring(1, line2.length()-1);
        String nums[] = line1m.split(",");
        String days[] = line2m.split(",");
        int[] buffer = new int[nums.length];
        ArrayList<String> ans = new ArrayList<String>();
        for(int i = 0; i < buffer.length; i++)
        {
            int timetaken = 0;
            int temp = Integer.parseInt(nums[i]);
            int timetakenbyproduct = Integer.parseInt(days[i]);
            while(temp<100)
            {
                temp = temp + timetakenbyproduct;
                timetaken++;
            }
            buffer[i] = timetaken;
        }
        for(int i = 0; i < buffer.length; i++)
        {
            int count = 1;
            int temp = buffer[i];
            for(int j = 0; j<buffer.length; j++)
            {
                int temp2 = buffer[j];

                if(temp < temp2 && i < j)
                {
                    break;
                }
                else if(i < j)
                {
                    count++;
                }
            }
            ans.add("("+buffer[i]+","+count+")");
            i = i - 1 + count;
        }
        String ans1 = Arrays.toString(ans.toArray()).replace(" ", "").replace("[", "").replace("]", "");
        System.out.println(ans1);
        sc.close();
    }
}