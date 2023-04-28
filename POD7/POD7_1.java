import java.util.*;

public class POD7_1 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String l2 = sc.nextLine();
        String line1[] = l1.split(" ");
        String line2[] = l2.split(" ");
        ArrayList<Integer> q1 = new ArrayList<Integer>();
        ArrayList<Integer> q2 = new ArrayList<Integer>();
        int sum1 = -1;
        int sum2 = -2;
        int count = 0;
        for(int i = 0; i < line1.length; i++)
        {
            q1.add(Integer.parseInt(line1[i]));
        }
        for(int i = 0; i < line2.length; i++)
        {
            q2.add(Integer.parseInt(line2[i]));
        }
        while(sum1 != sum2)
        {
            sum1 = 0;
            sum2 = 0;
            int temp = 0;
            for(int i = 0; i < q1.size(); i++)
            {
                sum1 = sum1 + q1.get(i);
            }
            for(int i = 0; i < q2.size(); i++)
            {
                sum2 = sum2 + q2.get(i);
            }
            if(sum2 < sum1)
            {
                temp = q1.get(0);
                q1.remove(0);
                q2.add(temp);
                count++;
            }
            else if(sum1 < sum2)
            {
                temp = q2.get(0);
                q2.remove(0);
                q1.add(temp);
                count++;
            }
            if(count > q1.size()+q2.size())
            {
                count = -1;
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
