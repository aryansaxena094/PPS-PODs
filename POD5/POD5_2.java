import java.util.*;

public class POD5_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String l2 = sc.nextLine();
        String line2[] = l2.split(" ");
        int temp = 0;
        int count = 0;
        int i = line2.length-1;
        while(i>=0)
        {
            int flag = 0;
            for(int j = i - 1; j >= 0; j--)
            {
                flag++;
                int a = Integer.parseInt(line2[j]);
                if(a >= (i - j))
                {
                    temp = j;
                }
            }
            if(flag>0)
            {
                i=temp;
            }
            count = count + 1;
            i--;
        }
        System.out.println(count);
    }
}
