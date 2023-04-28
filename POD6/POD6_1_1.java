import java.util.*;

public class POD6_1_1 {
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String ans = "";
        while(num != 0)
        {
            for(int i = 0; i < value.length; i++)
            {
                String temp = roman[i];
                if(value[i] <= num)
                {
                    ans = ans + temp;
                    num = num - value[i];
                    break;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
