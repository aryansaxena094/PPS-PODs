import java.util.*;
public class POD4_3 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        ArrayList<Character> openers = new ArrayList<Character>();
        ArrayList<Character> closers = new ArrayList<Character>();
        boolean ans1 = false;
        for(int i = 0; i < line1.length(); i++)
        {
            if(line1.charAt(i) == '(' || line1.charAt(i) == '{' || line1.charAt(i) == '[')
            {
                openers.add(line1.charAt(i));
            }
            else if(line1.charAt(i) == ')' || line1.charAt(i) == '}' || line1.charAt(i) == ']')
            {
                closers.add(line1.charAt(i));
            }
        }
        openers.sort(null);
        closers.sort(null);
        if(openers.size() == closers.size())
        {
            for(int i = 0; i < openers.size(); i++)
            {
                if(openers.get(i) == '(')
                {
                    if(closers.get(i) == ')')
                        {
                            ans1 = true;
                        }
                    else
                    {
                        ans1 = false;
                        break;
                    }
                }
                else if(openers.get(i) == '[')
                {
                    if(closers.get(i) == ']')
                    {
                        ans1 = true;
                    }
                    else
                    {
                        ans1 = false;
                        break;
                    }
                }
                else if(openers.get(i) == '{')
                {
                    if(closers.get(i) == '}')
                    {
                        ans1 = true;
                    }
                    else
                    {
                        ans1 = false;
                        break;
                    }
                }
            }
        }
        System.out.println(ans1);
        sc.close();
    }
}
