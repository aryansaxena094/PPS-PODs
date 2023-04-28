import java.util.*;
public class POD5_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        String l1 = sc.nextLine();
        String line[] = l1.split(" ");
        int index = 0;
        int jump = 0;
        for(int i = line.length-1; i >= 0; i--)
        {
            for(int j = i-1; j >= 0; j--)
            {
                int a =  Integer.parseInt(line[j]);
                int b = (i-j);
                if(a >= b)
                {
                    index = j;
                }
            }
            if(index > 0)
            {
                i = index + 1;
            }
            else
            {
                jump++;
                break;
            }
            jump++;
        }
        System.out.println(jump);
        sc.close();   
    }
}