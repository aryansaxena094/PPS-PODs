import java.util.*;
public class POD6_3 {
    
    public static int roman (char a)
    {
        int value = 0;
        
        if(a == 'I')
        {
            value = 1;
        }
        else if(a == 'V')
        {
            value = 5;
        }
        else if(a == 'X')
        {
            value = 10;
        }
        else if(a == 'L')
        {
            value = 50;
        }
        
        else if(a == 'C')
        {
            value = 100;
        }
        
        else if(a == 'D')
        {
            value = 500;
        }
        else if(a == 'M')
        {
            value = 1000;
        }
        return value;
    }
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        String rn = sc.nextLine();
        int sum = 0;
        
        for(int i = (rn.length()-1); i >= 0; i--)
        {
            char ch = rn.charAt(i);
            int val = roman(ch);
            if(i != (rn.length()-1))
            {
                char ch2 = rn.charAt(i+1);
                int prevval = roman(ch2);
                if(val >= prevval)
                {
                    sum = sum + val;
                }
                else if(val < prevval)
                {
                    sum = sum - val;
                }
            }
            else
            {
                sum = sum + val;
            }
            
            
        }
        System.out.println(sum);
        sc.close();
    }
}
