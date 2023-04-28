import java.util.*;

public class POD4_2 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] array1 = line2.split(",");
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0; i < array1.length; i++)
        {
            int temp = Integer.parseInt(array1[i]);
            
            if(temp != -1)
            {
                ans.add(temp);
            }
            else
            {
                count++;
            }
        }
        while(count>0)
        {
            ans.add(-1);
            count--;
        }
        String ans1 = Arrays.toString(ans.toArray()).replace(" ", "").replace("[", "").replace("]", "");
        System.out.println(ans1);
        sc.close();
    }
}
